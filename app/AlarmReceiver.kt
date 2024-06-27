package com.ar.edgarglienke.equivalences

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Enviar las tintas saludos Ed", Toast.LENGTH_LONG).show()
        // Aquí podrías agregar código adicional según sea necesario
    }
}
}