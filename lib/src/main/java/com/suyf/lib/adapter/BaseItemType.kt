package com.suyf.lib.adapter

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseItemType<in T, H : RecyclerView.ViewHolder> : ItemType<T> {

    override fun onBindView(h: RecyclerView.ViewHolder, position: Int, item: T) {
        val holder = h as H
        bindView(holder, position, item)
    }

    override fun createHolder(itemView: View): RecyclerView.ViewHolder {
        return bindHolder(itemView)
    }

    abstract fun bindView(holder: H, position: Int, item: T)

    abstract fun bindHolder(itemView: View): H

}