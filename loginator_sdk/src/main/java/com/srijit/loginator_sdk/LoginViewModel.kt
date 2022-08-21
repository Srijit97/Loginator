package com.srijit.loginator_sdk

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class LoginViewModel : ViewModel() {
    private val _isLoginFlow = MutableLiveData(true)
    val isLoginFLow = _isLoginFlow as LiveData<Boolean>

    private val _authenticationSuccessful = MutableLiveData(false)
    val authenticationSuccessful = _authenticationSuccessful as LiveData<Boolean>

    val emailId = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    //var auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun setFlow(isLogin: Boolean) {
        _isLoginFlow.value = isLogin
    }

    fun authenticateWithEmailAndPassword() {
//        isLoginFLow.value?.let {
//            if (!it) {
//                auth.createUserWithEmailAndPassword(this.emailId.value!!, this.password.value!!)
//                    .addOnSuccessListener {
//                        _authenticationSuccessful.value = true
//                    }.addOnFailureListener {
//
//                    }
//            } else {
//                auth.signInWithEmailAndPassword(this.emailId.value!!, this.password.value!!)
//                    .addOnSuccessListener {
//                        _authenticationSuccessful.value = true
//                    }.addOnFailureListener {
//
//                    }
//            }
//
//        }
    }
}