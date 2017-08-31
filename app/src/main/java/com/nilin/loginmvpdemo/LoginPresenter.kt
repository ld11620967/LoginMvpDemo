package com.nilin.loginmvpdemo


/**
 * Created by liangd on 2017/8/31.
 */
open class LoginPresenter(private val loginView: ILoginView) : ILoginPresenter {

    private val loginModel: ILoginModel

    init {
        this.loginModel = LoginModel(this)
    }

    override fun loginToServer(userName: String, password: String) {
        loginView.showProgress(true)
        loginModel.login(userName, password)

    }

    override fun loginSucceed() {
        loginView.showProgress(false)
        loginView.showLoginView()
    }
}