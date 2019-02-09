package br.com.andreyneto.movilenext3pushnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyFirebaseMessagingService : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
