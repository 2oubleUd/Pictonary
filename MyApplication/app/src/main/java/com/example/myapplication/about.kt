package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_freerun.*
import kotlinx.android.synthetic.main.activity_online.*

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        imageButton9.setOnClickListener {

            var go_back: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(go_back)
        }

        textView4.setText("                PICTIONARY\n\n\n\nTworcy:\nSzymon Bilinski 241818\nKamil Stepien 249162\nMikolaj Struzik 244057\n\n")

    }
}