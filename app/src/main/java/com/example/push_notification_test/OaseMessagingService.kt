package com.example.push_notification_test

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class OaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.d("masuk notifikasi", "haha")
    }

    override fun onNewToken(token: String) {
        //send new token to backend server for targeted notification
        Log.e("token", token)
    }




}
