package com.suyf.recyclerviewadapter.test

import android.util.Log

object LogUtils {
    private val TAG = javaClass.simpleName

    fun d(message: String) {
        Log.d(TAG, message)
    }

    fun e(message: String) {
        Log.e(TAG, message)
    }
}