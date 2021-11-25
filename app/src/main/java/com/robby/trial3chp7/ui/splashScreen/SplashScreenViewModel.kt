package com.robby.trial3chp7.ui.splashScreen

import androidx.lifecycle.ViewModel
import com.robby.trial3chp7.data.local.SharedPref

class SplashScreenViewModel : ViewModel() {
    var  navigator: SplashScreenNavigator? = null

    fun checkIsLogin() {
        if(SharedPref.isLogin == true)
            navigator?.onLogged()
        else
            navigator?.unLogged()
    }
}