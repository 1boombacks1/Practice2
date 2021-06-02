package ru.mirea.nikolaev.dialog

import android.app.ProgressDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var calText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        calText = findViewById(R.id.calText)
    }

    fun onClickShowDialog(view: View){
        val dialogFragment = AlertDialogFragment()
        dialogFragment.show(supportFragmentManager,"mirea")
    }

    fun onClickTimePickerDialog(view: View){
        val timePicker = MyTimeDialogFragment(this, textView)

        timePicker.show(supportFragmentManager, "myTimePicker")
    }

    fun onClickDatePickerDialog(view: View){
        val dateDialog = MyDateDialogFragment(this,calText)
        dateDialog.show(supportFragmentManager, "myDateDialog")
    }

    fun onClickProgressDialog(view: View){
        val progressDialog = MyProgressDialogFragment()
        progressDialog.show(supportFragmentManager, "myProgressDialog")
    }



    fun onOkClicked(){
        Toast.makeText(this,"вы выбради 'Иду дальше'", Toast.LENGTH_LONG).show()
    }

    fun onCancelClicked(){
        Toast.makeText(this,"вы выбради 'Нет'", Toast.LENGTH_LONG).show()
    }
    fun onPauseClicked(){
        Toast.makeText(this,"вы выбради 'На паузе'", Toast.LENGTH_LONG).show()
    }
}