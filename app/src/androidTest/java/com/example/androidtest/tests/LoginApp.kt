package com.example.androidtest.tests

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.androidtest.pages.BasePage
import com.example.androidtest.pages.LoginPage
import org.junit.Before
import org.junit.Test

class LoginApp{
    private lateinit var device: UiDevice
    private val basePage: BasePage = BasePage()
    private val loginPage: LoginPage = LoginPage()
    private val email: String = System.getenv("TEST_ACCOUNT")
    private val password: String = System.getenv("TEST_PASSWORD")

    @Before
    fun openApp() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        basePage.launchApp(device)
    }

    @Test
    fun loginApp() {
        loginPage.switchLoginPage(device)
        loginPage.login(device, email, password)
    }

    @Test
    fun signUpApp() {
        loginPage.switchLoginPage(device)
        loginPage.signUp(device, email, password)
    }
}