package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import b.foo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        foo()
    }
}
