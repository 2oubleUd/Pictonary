package com.example.myapplication

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var oline:  Intent = Intent(applicationContext,online::class.java)
            startActivity(oline)
        }

        button1.setOnClickListener {

            var htp:  Intent = Intent(applicationContext,Howtoplay::class.java)
            startActivity(htp)

        }
        button2.setOnClickListener {

            var abt:  Intent = Intent(applicationContext,about::class.java)
            startActivity(abt)

        }
        button3.setOnClickListener {

            var friran:  Intent = Intent(applicationContext,freerun::class.java)
            startActivity(friran)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Metoda onStart! MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Metoda onResume! MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Metoda onPause! MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Metoda onStop! MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Metoda onDestroy! MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Metoda onRestart! MainActivity")
    }
}