package ru.mirea.nikolaev.dialog

import android.app.Dialog
import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyProgressDialogFragment(): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val progressDialog = ProgressDialog(activity)
        progressDialog.setTitle("Title")
        progressDialog.setMessage("Идет загрузка...")
        return progressDialog
    }
}