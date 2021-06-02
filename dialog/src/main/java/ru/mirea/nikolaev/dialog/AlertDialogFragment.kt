package ru.mirea.nikolaev.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class AlertDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(activity)
            .setTitle("Здраствуй Моюильный Пунтник МИРЭА")
            .setMessage("Ответь мне на вопрос: Успех близок?")
            .setIcon(R.mipmap.ic_launcher_round)
            .setPositiveButton("Иду дальше") {
                dialog,id -> (activity as MainActivity).onOkClicked()
                dialog.cancel()
            }
            .setNeutralButton("На паузе") {dialog,id ->
                (activity as MainActivity).onPauseClicked()
                dialog.cancel()
            }
            .setNegativeButton("Нет") {dialog,id ->
                (activity as MainActivity).onCancelClicked()
                dialog.cancel()
            }
            .create()
}