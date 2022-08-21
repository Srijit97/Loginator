package com.srijit.loginator_sdk

import android.content.Context
import android.content.Intent

class LoginatorBuilder {

    fun startLoginFlow(context: Context) {
        val intent = Intent(context,LoginActivity::class.java)
        context.startActivity(intent)
    }
}