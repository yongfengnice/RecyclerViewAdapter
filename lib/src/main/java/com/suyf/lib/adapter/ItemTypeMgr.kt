package com.suyf.lib.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ItemTypeMgr<T> {

    private val itemTypeList: MutableList<ItemType<T>> = mutableListOf()

    fun addItem(itemType: ItemType<T>) = itemTypeList.add(itemType)

    fun getItemViewType(position: Int, item: T): Int {
        for (index in itemTypeList.indices) {
            if (itemTypeList[index].renderView(position, item)) {//index as viewType
                return index
            }
        }
        throw IllegalArgumentException("ItemTypeMgr getItemViewType ====> error")
    }

    fun createViewHolder(inflater: LayoutInflater, viewType: Int, parent: ViewGroup): RecyclerView.ViewHolder {
        val itemType = itemTypeList[viewType]
        return itemType.createHolder(inflater.inflate(itemType.setLayout(), parent, false))
    }

    fun onBindView(viewHolder: RecyclerView.ViewHolder, position: Int, item: T) {
        for (itemType in itemTypeList) {
            if (itemType.renderView(position, item)) {
                itemType.onBindView(viewHolder, position, item)
                break
            }
        }
    }

}