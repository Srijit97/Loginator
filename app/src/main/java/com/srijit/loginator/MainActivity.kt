package com.srijit.loginator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.srijit.loginator_sdk.LoginatorBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt_login).setOnClickListener {
            LoginatorBuilder().startLoginFlow(this)
        }
    }
}