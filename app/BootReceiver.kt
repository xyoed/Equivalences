class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            val mainActivity = MainActivity()
            mainActivity.setWeeklyAlarm()
        }
    }
}

