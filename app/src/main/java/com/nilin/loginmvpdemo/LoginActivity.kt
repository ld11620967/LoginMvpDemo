package com.nilin.loginmvpdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Created by liangd on 2017/8/31.
 */
class LoginActivity : AppCompatActivity(), ILoginView {

    private var loginPresenter: LoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        loginBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                //模拟登陆，不需要账号密码
                loginPresenter?.loginToServer("", "")
            }
        })
    }

    override fun showProgress(enable: Boolean) {
        if (enable) {
            progressBar.setVisibility(View.VISIBLE)
        } else {
            progressBar.setVisibility(View.GONE)
        }
    }

    override fun showLoginView() {
        Toast.makeText(this@LoginActivity, "登录成功", Toast.LENGTH_LONG).show()
        finish()
    }
}