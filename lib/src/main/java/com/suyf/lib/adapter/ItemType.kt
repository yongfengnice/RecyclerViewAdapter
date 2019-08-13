package com.suyf.lib.adapter

import android.support.v7.widget.RecyclerView
import android.view.View

interface ItemType<in T> {
    fun renderView(position: Int, item: T): Boolean
    fun setLayout(): Int
    fun onBindView(holder: RecyclerView.ViewHolder, position: Int, item: T)
    fun createHolder(itemView: View): RecyclerView.ViewHolder
}