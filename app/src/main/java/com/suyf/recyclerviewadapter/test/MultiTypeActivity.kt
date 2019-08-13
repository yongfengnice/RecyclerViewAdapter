package com.suyf.recyclerviewadapter.test

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.AdapterView
import android.widget.Toast
import com.suyf.lib.adapter.MultiTypeAdapter
import com.suyf.recyclerviewadapter.R
import com.suyf.recyclerviewadapter.test.adapter.AppleItemType1
import com.suyf.recyclerviewadapter.test.adapter.OrangeItemType2
import com.suyf.recyclerviewadapter.test.adapter.PeaItemType3
import com.suyf.recyclerviewadapter.test.adapter.TitleItemType4
import com.suyf.recyclerviewadapter.test.bean.MultiTypBean

class MultiTypeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_type)

        val list = mutableListOf<MultiTypBean>()

        for (i in 0..100) {
            val nextInt = i % 3
            list.add(MultiTypBean(nextInt, "apple:$nextInt", "orange:$nextInt", "pea:$nextInt"))
        }

        val adapter = MultiTypeAdapter<MultiTypBean>(this, list)
        adapter.addItem(TitleItemType4())
        adapter.addItem(AppleItemType1())
        adapter.addItem(OrangeItemType2())
        adapter.addItem(PeaItemType3())
        adapter.itemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MultiTypeActivity, "click position:$position", Toast.LENGTH_SHORT).show()
        }
        adapter.itemLongClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MultiTypeActivity, "long click position:$position", Toast.LENGTH_SHORT).show()
        }
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.adapter = adapter
    }
}