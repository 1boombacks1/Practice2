package ru.mirea.nikolaev.notificationapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID = "ru.mirea.nikolaev.notificationapp.ANDROID"
    private var ID_MSG = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSendNtfc(view: View){
        val notificationManager: NotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val resultIntent = Intent(this, MainActivity:: class.java)
        val pendingResultIntent = PendingIntent.getActivity(this,0,
        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val notificationChannel = NotificationChannel(CHANNEL_ID,"my notification", NotificationManager.IMPORTANCE_DEFAULT)
            notificationChannel.description = "Классное описание уведомления"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.CYAN
            notificationChannel.vibrationPattern = longArrayOf(0,1000,500,1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        val builder = NotificationCompat.Builder(this,CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Заголовок")
            .setContentText("Текст для 2 практики")
            .setWhen(System.currentTimeMillis())
            .setProgress(100,50,false)
            .setContentIntent(pendingResultIntent)
        val notification = builder.build()
        notificationManager.notify(ID_MSG++,notification)
    }
}