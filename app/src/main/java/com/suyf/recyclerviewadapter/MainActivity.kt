package com.suyf.recyclerviewadapter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.suyf.recyclerviewadapter.test.MultiTypeActivity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_multi_type)
                .setOnClickListener {
                    startActivity(Intent(this, MultiTypeActivity::class.java))
                }
    }

}
