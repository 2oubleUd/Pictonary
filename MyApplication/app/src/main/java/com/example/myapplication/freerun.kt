
package com.example.myapplication

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_freerun.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*


class freerun : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freerun)

        imageButton7.setOnClickListener {

            var go_back: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(go_back)
        }
        val firebase= FirebaseDatabase.getInstance()
        val myCanvasV = MyCanvasView(this)




/*sprawdzanie czy ma byc delay 5 sekundowy - przejscie po nacisnieciu przycisku rysuj w */
if(playername.pomoc==1){
        GlobalScope.launch {
            delay(5000L)

            var ol: Intent = Intent(applicationContext, online::class.java)
            startActivity(ol)
        }
        }
        setContentView(myCanvasV)


    }


    }






