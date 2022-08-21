package com.srijit.loginator_sdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.srijit.loginator_sdk.databinding.ActivityLoginBinding

internal class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.model = viewModel
        binding.lifecycleOwner = this

        setOnClicks()
    }

    private fun setOnClicks() {
        binding.tvLogin.setOnClickListener {
            viewModel.setFlow(isLogin = true)
        }
        binding.tvSignUp.setOnClickListener {
            viewModel.setFlow(isLogin = false)
        }
    }
}