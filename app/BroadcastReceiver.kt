
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Mostrar el mensaje emergente
        Toast.makeText(context, "¡Es domingo a las 13:00!", Toast.LENGTH_LONG).show()
    }
}

