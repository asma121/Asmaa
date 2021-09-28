package com.example.asmaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView=findViewById(R.id.textView2)
        val str1=intent.getStringExtra("name")
        val str2=intent.getStringExtra("location")
        val str3=intent.getStringExtra("number")

        textView.text="$str1 $str2 $str3"
    }
}