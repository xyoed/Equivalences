package com.ar.edgarglienke.Equivalences


import android.content.Context
import android.content.Intent
import android.app.AlarmManager
import android.app.PendingIntent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ar.edgarglienke.equivalences.R
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private val listaDatos = listOf(

        listOf("7107", "Fancy Pink", "5000", "Rosa Fantasía", "246", "233", "232"),
        listOf("7109", "Young At Heart", "5001", "Corazón Joven", "247", "226", "226"),
        listOf("7110", "Cosmetic Blush", "5002", "Rubor Delicado", "246", "231", "226"),
        listOf("7112", "Pinkish", "5003", "Aroma Rosado", "245", "234", "226"),
        listOf("7113", "Roseate", "5004", "Rosa de Algodón", "247", "229", "219"),
        listOf("7114", "Palish Peach", "5005", "Melocotón", "247", "236", "225"),


        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setWeeklyAlarm()
    }

    private fun setWeeklyAlarm() {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        val calendar = Calendar.getInstance().apply {
            set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY)
            set(Calendar.HOUR_OF_DAY, 13)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }

        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY * 7,
            pendingIntent
        )
    }
}