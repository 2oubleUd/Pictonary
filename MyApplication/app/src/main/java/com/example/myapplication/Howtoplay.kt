package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_howtoplay.*
import kotlinx.android.synthetic.main.activity_online.*

class Howtoplay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_howtoplay)



        imageButton8.setOnClickListener {

            var go_back: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(go_back)
        }
        var htp="\n\n\n\nGra polega na zgadywaniu wylosowanego hasla."
        htp=htp+" Aby rozpocząć grę najpierw jeden gracz musi wejść w zakładkę draw. Po wylosowaniu hasla "
        htp=htp+"pierwszy gracz naciska przycisk Pisz ,a drugi GUESS. "
        htp=htp+"Następnie pierwszy gracz wpisuje wskazowki dotyczace haslo(bez podania samego hasla), a drugi je zgaduje "
    textView.setText(htp)
        textView8.setText("\n\n\n   Witamy w naszej aplikacji")


    }
}