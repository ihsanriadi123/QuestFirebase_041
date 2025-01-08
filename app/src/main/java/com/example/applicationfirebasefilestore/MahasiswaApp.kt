package com.example.applicationfirebasefilestore

import android.app.Application


class MahasiswaApp:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}