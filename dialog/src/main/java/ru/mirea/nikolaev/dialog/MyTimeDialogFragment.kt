package ru.mirea.nikolaev.dialog

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import java.text.SimpleDateFormat
import java.util.*

class MyTimeDialogFragment(context: Context, textView: TextView): DialogFragment() {
     val txtView: TextView = textView

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val cal = Calendar.getInstance()
        val timeSetListener = TimePickerDialog.OnTimeSetListener { _, hour, minute ->
        cal.set(Calendar.HOUR_OF_DAY, hour)
        cal.set(Calendar.MINUTE, minute)
        txtView.text = SimpleDateFormat("HH:mm").format(cal.time)
        }
        return TimePickerDialog(context, timeSetListener,
            cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
            true)
    }
}