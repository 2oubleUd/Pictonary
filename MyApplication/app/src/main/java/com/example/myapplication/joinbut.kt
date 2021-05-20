package com.example.myapplication

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_joinbut.*
import java.util.*
import android.view.Gravity
import android.support.v4.app.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class joinbut : AppCompatActivity() {

    private lateinit var myRef:DatabaseReference
    private lateinit var listOfItems: ArrayList<Databasepass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joinbut)
        /*laczenie z baza danych*/
        val firebase=FirebaseDatabase.getInstance()
        myRef=firebase.getReference()


var datas=""
        myRef.addValueEventListener(object: ValueEventListener{
            override fun onCancelled(DataBasEerror: DatabaseError) {

            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {

                if(dataSnapshot.exists())
                {/*pobieranie danych z bazy i zapisywanie w zmiennych*/

                    var data=dataSnapshot.getValue().toString()
                    var dat=data.substring(data.indexOf("=")+12)
                    dat.trimEnd()
                    var da=dat.split("}")[0]
                    datas=datas+da+"\n"
                    textView6.setText(datas)
                    var haslo:String


                    var haselko=dataSnapshot.getValue().toString()
                    var haselk=haselko.substring(haselko.indexOf(",")+22)
                    haselk.trimEnd()
                    var hasel=haselk.split("}")[0]


button5.setOnClickListener{
    haslo=editTextTextPersonName.text.toString()
    if(haslo==hasel)
    {/*wyswietlanie komunikatu o poprawnym odgadnieciu hasla*/
        val toast = Toast.makeText(applicationContext,"Gratulacje, poprawne haslo!",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0)
        toast.show()
        GlobalScope.launch {
            delay(1000L)
            var good_boi: Intent = Intent(applicationContext, online::class.java)
            startActivity(good_boi)
        }
    }

}                }



            }


        })

    }
    }






