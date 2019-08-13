package com.suyf.recyclerviewadapter.test.adapter

import android.view.View
import com.suyf.lib.adapter.BaseItemType
import com.suyf.lib.adapter.ViewHolder
import com.suyf.recyclerviewadapter.R
import com.suyf.recyclerviewadapter.databinding.ItemBinderTitleBinding
import com.suyf.recyclerviewadapter.test.bean.MultiTypBean

class TitleItemType4 : BaseItemType<MultiTypBean, ViewHolder<ItemBinderTitleBinding>>() {
    override fun bindView(holder: ViewHolder<ItemBinderTitleBinding>, position: Int, item: MultiTypBean) {
        holder.binding.title.text = "part:$position"
    }

    override fun bindHolder(itemView: View): ViewHolder<ItemBinderTitleBinding> {
        return ViewHolder(itemView)
    }

    override fun renderView(position: Int, item: MultiTypBean): Boolean {
        return position % 4 == 0
    }

    override fun setLayout() = R.layout.item_binder_title
}