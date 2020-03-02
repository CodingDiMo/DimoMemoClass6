package com.example.dimomemodemo

import android.app.Application
import com.naver.maps.map.NaverMapSdk
import io.realm.Realm


class DimoMemoApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        NaverMapSdk.getInstance(this).setClient(
            NaverMapSdk.NaverCloudPlatformClient("hdrw0pcv18"))
    }
}