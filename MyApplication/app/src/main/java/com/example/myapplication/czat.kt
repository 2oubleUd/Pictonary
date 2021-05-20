package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_czat.*
import kotlinx.android.synthetic.main.activity_joinbut.*
import kotlinx.android.synthetic.main.activity_room.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.nio.file.Files.size
import java.util.*
class czat : AppCompatActivity() {

    private lateinit var myRef:DatabaseReference
    private lateinit var listOfItems: ArrayList<Databasepass>

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_czat)
        /*laczenie sie z baza danych*/
        val firebase=FirebaseDatabase.getInstance()
        myRef=firebase.getReference()

        var dat=""
        button6.setOnClickListener{
            /*pobieranie danej od uzytkownika*/
            val firebaseInput=wiadom("~"+editTextTextPersonName2.text.toString())
            /*wyslanie danej do bazy danych*/
            myRef.child("wiadomosc").setValue(firebaseInput)
            dat=dat+editTextTextPersonName2.text.toString()+"\n"
            textView3.setText(dat)
            textView3.visibility= View.VISIBLE
            editTextTextPersonName2.setText("")
        }


    }
}