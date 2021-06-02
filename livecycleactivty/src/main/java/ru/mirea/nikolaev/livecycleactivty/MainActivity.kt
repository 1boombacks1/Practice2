package ru.mirea.nikolaev.livecycleactivty

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("INFO", "Метод onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO","Метод OnStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("INFO","Метод onRestoreInstanceState()")
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.i("INFO","Метод onPostCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO","Метод onResume()")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.i("INFO","Метод onPostResume()")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.i("INFO","Метод onAttachedToWindow()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO","Метод onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i("INFO","Метод onSaveInstanceState()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO","Метод onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO","Метод onDestroy()")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.i("INFO","Метод onDetachedFromWindow()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("INFO","Метод onRestart()")
    }
}