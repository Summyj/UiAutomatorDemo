package com.example.androidtest.pages

import androidx.test.uiautomator.UiDevice
import com.example.androidtest.selectors.LoginSelector

class LoginPage{

    private val loginSelector: LoginSelector = LoginSelector()

    fun switchLoginPage(device: UiDevice) {
        loginSelector.loginPage(device).click()
    }

    fun login(device: UiDevice, email: String, password: String) {
        loginSelector.email(device).text = email
        loginSelector.password(device).text = password
        loginSelector.loginButton(device).click()
    }

    fun signUp(device: UiDevice, email: String, password: String) {
        loginSelector.signUpTab(device).click()
        loginSelector.email(device).text = email
        loginSelector.password(device).text = password
        loginSelector.confirmPassword(device).text = password
        loginSelector.signUpButton(device).click()
    }
}