package ru.mirea.nikolaev.dialog

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import java.util.*

class MyDateDialogFragment(context: Context,txtView:TextView): DialogFragment() {
    val ct = context
    val textView = txtView
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(ct,DatePickerDialog.OnDateSetListener{view,year,monthOfYear,dayOfMonth ->
            textView.text = "$dayOfMonth $monthOfYear $year"
        },year,month,day)
    }
}