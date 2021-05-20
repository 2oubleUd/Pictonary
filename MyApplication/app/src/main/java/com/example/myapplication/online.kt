package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_czat.*
import kotlinx.android.synthetic.main.activity_online.*
import kotlinx.android.synthetic.main.activity_joinbut.*

class online : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online)

        join_button.setOnClickListener {

            var doloncz:  Intent = Intent(applicationContext,joinbut::class.java)
            startActivity(doloncz)


        }

        create_button.setOnClickListener {

            var oline: Intent = Intent(applicationContext, room::class.java)
            startActivity(oline)
        }

        join_by_code.setOnClickListener {

            var oline: Intent = Intent(applicationContext, online::class.java)
            startActivity(oline)
        }
        playername.pomoc=0
        imageButton3.setOnClickListener {

            var go_back: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(go_back)
        }
        imageButton6.setOnClickListener {
            /*imie uzytkownika*/
                playername.username = nametextinput.text.toString()
            textView7.setText(playername.username)
                textView7.visibility= View.VISIBLE
            nametextinput.setText("")
    }


    }




}