package ru.mirea.nikolaev.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickNewActivity(view: View){
        intent = Intent(this, SecondActivity::class.java)
        editText = findViewById(R.id.editText)
        intent.putExtra("key", editText.text.toString())
        startActivity(intent)
    }


}