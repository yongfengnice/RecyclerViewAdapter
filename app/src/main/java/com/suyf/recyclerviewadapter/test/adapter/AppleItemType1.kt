package com.suyf.recyclerviewadapter.test.adapter

import android.view.View
import com.suyf.lib.adapter.BaseItemType
import com.suyf.lib.adapter.ViewHolder
import com.suyf.recyclerviewadapter.R
import com.suyf.recyclerviewadapter.databinding.ItemBinder1Binding
import com.suyf.recyclerviewadapter.test.bean.MultiTypBean

class AppleItemType1 : BaseItemType<MultiTypBean, ViewHolder<ItemBinder1Binding>>() {

    override fun bindView(holder: ViewHolder<ItemBinder1Binding>, position: Int, item: MultiTypBean) {
        holder.binding.tv1.text = "position:$position,name:" + item.apple_name1
    }

    override fun bindHolder(itemView: View): ViewHolder<ItemBinder1Binding> {
        return ViewHolder(itemView)
    }

    override fun renderView(position: Int, item: MultiTypBean): Boolean {
        return item.type == 0
    }

    override fun setLayout() = R.layout.item_binder_1

}