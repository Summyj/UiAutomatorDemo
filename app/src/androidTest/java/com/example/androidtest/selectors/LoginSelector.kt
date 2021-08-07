package com.example.androidtest.selectors

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiSelector

class LoginSelector{

    fun loginPage(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().text("Login").className("android.widget.TextView")
        )
    }

    fun email(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().className("android.widget.EditText").description("input-email")
        )
    }

    fun password(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().className("android.widget.EditText").description("input-password")
        )
    }

    fun loginButton(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().text("LOGIN").className("android.widget.TextView")
        )
    }

    fun signUpTab(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().text("Sign up").className("android.widget.TextView")
        )
    }

    fun confirmPassword(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().className("android.widget.EditText").description("input-repeat-password")
        )
    }

    fun signUpButton(device: UiDevice): UiObject {
        return device.findObject(
            UiSelector().text("SIGN UP").className("android.widget.TextView")
        )
    }

}