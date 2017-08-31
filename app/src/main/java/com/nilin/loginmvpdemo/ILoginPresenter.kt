package com.nilin.loginmvpdemo


/**
 * Created by liangd on 2017/8/31.
 */
interface ILoginPresenter {

    fun loginToServer(userName: String, password: String)

    fun loginSucceed()
}