package com.mockdroid.libexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mockdroid.lib.LibDebug.Builder.i

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        i("Hello Irfan Nawawi")
    }
}