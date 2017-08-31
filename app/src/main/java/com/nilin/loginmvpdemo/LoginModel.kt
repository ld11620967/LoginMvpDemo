package com.nilin.loginmvpdemo

import android.os.Handler


/**
 * Created by liangd on 2017/8/31.
 */
class LoginModel(private val presenter: ILoginPresenter) : ILoginModel {

    private val mHandler = Handler()

    override fun login(name: String, password: String) {
        mHandler.postDelayed(Runnable {
            presenter.loginSucceed()
        }, 2000)
    }

}