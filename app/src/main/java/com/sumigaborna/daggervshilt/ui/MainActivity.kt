package com.sumigaborna.daggervshilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sumigaborna.daggervshilt.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}