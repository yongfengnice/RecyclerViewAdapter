package com.suyf.lib.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView

class MultiTypeAdapter<T>(var context: Context, var list: MutableList<T> = mutableListOf()) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>(), View.OnClickListener, View.OnLongClickListener {

    private val inflater: LayoutInflater by lazy { LayoutInflater.from(context) }

    private val itemTypeMgr: ItemTypeMgr<T> by lazy { ItemTypeMgr<T>() }

    var itemClickListener: AdapterView.OnItemClickListener? = null

    var itemLongClickListener: AdapterView.OnItemClickListener? = null

    fun addItem(itemType: ItemType<T>) {
        itemTypeMgr.addItem(itemType)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holder = itemTypeMgr.createViewHolder(inflater, viewType, parent)
        holder.itemView.setOnClickListener(this)
        holder.itemView.setOnLongClickListener(this)
        return holder
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        viewHolder.itemView.tag = position
        itemTypeMgr.onBindView(viewHolder, position, list[position])
    }

    override fun getItemViewType(position: Int): Int {
        return itemTypeMgr.getItemViewType(position, list[position])
    }

    override fun onClick(view: View?) {
        itemClickListener?.onItemClick(null, view, view?.tag as Int, 0)
    }

    override fun onLongClick(view: View?): Boolean {
        itemLongClickListener?.onItemClick(null, view, view?.tag as Int, 0)
        return true
    }

}
