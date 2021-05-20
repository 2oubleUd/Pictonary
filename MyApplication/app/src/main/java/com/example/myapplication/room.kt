package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_room.*
import java.nio.file.Files.size
import java.util.*
import java.util.Random


class room : AppCompatActivity() {

    private lateinit var myRef:DatabaseReference
    private lateinit var listOfItems: ArrayList<Databasepass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
submitData.setOnClickListener{
    playername.passy.set(playername.passy.size+1,hasloinput.text.toString())
}
        Butt.setOnClickListener{
            playername.pomoc=1
            var go_to_freerun: Intent = Intent(applicationContext, freerun::class.java)
            startActivity(go_to_freerun)

        }
        butt.setOnClickListener{
            var go_to_czat: Intent = Intent(applicationContext, czat::class.java)
            startActivity(go_to_czat)
        }
/*laczenie z baza danych*/
    val firebase=FirebaseDatabase.getInstance()
        myRef=firebase.getReference()

        /*losowanie hasla i wysylanie do bazy danych*/
        val wielkoscarray = playername.passy.size
        val randomowa = rand(0,wielkoscarray)
        textView2.setText("wylosowane haslo: "+playername.passy[randomowa])
        val firebaseInput=Databasepass(playername.passy[randomowa].toString())
        myRef.child("haslohaselko").setValue(firebaseInput)
        submitData.setOnClickListener{
            val haslo=hasloinput.text.toString()


        }


    }


    val random = Random()

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}
