package com.suyf.recyclerviewadapter.test.adapter

import android.view.View
import com.suyf.lib.adapter.BaseItemType
import com.suyf.lib.adapter.ViewHolder
import com.suyf.recyclerviewadapter.R
import com.suyf.recyclerviewadapter.databinding.ItemBinder2Binding
import com.suyf.recyclerviewadapter.test.bean.MultiTypBean

class OrangeItemType2 : BaseItemType<MultiTypBean, ViewHolder<ItemBinder2Binding>>() {

    override fun bindView(holder: ViewHolder<ItemBinder2Binding>, position: Int, item: MultiTypBean) {
        holder.binding.tv1.text = "position:$position,name:" + item.orange_name2
        holder.binding.tv2.text = "position:$position,name:" + item.orange_name2
    }

    override fun bindHolder(itemView: View): ViewHolder<ItemBinder2Binding> {
        return ViewHolder(itemView)
    }

    override fun renderView(position: Int, item: MultiTypBean): Boolean {
        return item.type == 1
    }

    override fun setLayout() = R.layout.item_binder_2

}