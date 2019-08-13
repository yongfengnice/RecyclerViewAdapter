package com.suyf.recyclerviewadapter.test.adapter

import android.view.View
import com.suyf.lib.adapter.BaseItemType
import com.suyf.lib.adapter.ViewHolder
import com.suyf.recyclerviewadapter.R
import com.suyf.recyclerviewadapter.databinding.ItemBinder3Binding
import com.suyf.recyclerviewadapter.test.bean.MultiTypBean

class PeaItemType3 : BaseItemType<MultiTypBean, ViewHolder<ItemBinder3Binding>>() {
    override fun bindView(holder: ViewHolder<ItemBinder3Binding>, position: Int, item: MultiTypBean) {
        holder.binding.info = "position:$position,name:" + item.pea_name3
    }

    override fun bindHolder(itemView: View): ViewHolder<ItemBinder3Binding> {
        return ViewHolder(itemView)
    }

    override fun renderView(position: Int, item: MultiTypBean): Boolean {
        return item.type == 2
    }

    override fun setLayout() = R.layout.item_binder_3
}