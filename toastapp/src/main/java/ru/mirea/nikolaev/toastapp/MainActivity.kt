package ru.mirea.nikolaev.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(this,
            "Здраствуй,друг! Николаев Яков Алексеевич",
            Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val toastContainer: LinearLayout = toast.view as LinearLayout
        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.ic_launcher_background)
        toastContainer.addView(imageView, 0)
        toast.show()
    }
}