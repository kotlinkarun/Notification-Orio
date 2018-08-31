package com.app.article

import android.app.NotificationChannel
import android.app.NotificationManager
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v7.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        showNotification()


    }

    private fun showNotification() {
        val CHANNELL_ID="com.app.article"
        val CHANNELL_NAME="AppName"

        val notificationManager:NotificationManager= this.getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
             val IMPORTANCE=NotificationManager.IMPORTANCE_HIGH
             val notificationChannel= NotificationChannel(CHANNELL_ID,CHANNELL_NAME,IMPORTANCE)
            notificationManager.createNotificationChannel(notificationChannel)
        } else {
            TODO("VERSION.SDK_INT < O")
        }*/

        val builder=NotificationCompat.Builder(this,CHANNELL_ID)

        builder.setContentTitle("Loading...")
        builder.setSmallIcon(android.R.drawable.stat_sys_download)
        builder.setContentText("This is my Notifaction.")
        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))

        val notification = builder.build()
        notificationManager.notify(23, notification)
    }
}
