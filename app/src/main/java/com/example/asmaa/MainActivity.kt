package com.example.asmaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Edname:EditText
    lateinit var Edlocation:EditText
    lateinit var Ednumber:EditText
    lateinit var butoa:Button
    lateinit var butv:Button
    lateinit var buna:Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Edname=findViewById(R.id.PersonName)
        Edlocation=findViewById(R.id.Personlocation)
        Ednumber=findViewById(R.id.TextNumber)
        butoa=findViewById(R.id.button)
        butv=findViewById(R.id.button2)
        buna=findViewById(R.id.button3)
        textView=findViewById(R.id.textView)
        

        butoa.setOnClickListener{
            Toast.makeText(applicationContext,"${Edname.text},${Edlocation.text},${Ednumber.text}",Toast.LENGTH_LONG).show()
        }

        butv.setOnClickListener{
            textView.text="${Edname.text},${Edlocation.text},${Ednumber.text}"
        }

        buna.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name","${Edname.text}")
            intent.putExtra("location","${Edlocation.text}")
            intent.putExtra("number","${Ednumber.text}")
            startActivity(intent)
        }
    }
}