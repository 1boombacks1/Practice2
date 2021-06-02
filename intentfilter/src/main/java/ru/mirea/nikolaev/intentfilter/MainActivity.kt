package ru.mirea.nikolaev.intentfilter

import android.content.Intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.internal.ContextUtils.getActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickInternet(view: View){
        val address:Uri = Uri.parse("https://www.mirea.ru/")
        val openLinkIntent: Intent = Intent(Intent.ACTION_VIEW, address)

        if(openLinkIntent.resolveActivity(this.packageManager) != null)
            startActivity(openLinkIntent)
        else
            Log.d("Error", "Не удалось обработать намерение!")
    }

    fun onClickSendMsg(view: View){
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Mirea")
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Николаев Яков Алексеевич")
        startActivity(Intent.createChooser(shareIntent,"Мои ФИО"))
    }
}