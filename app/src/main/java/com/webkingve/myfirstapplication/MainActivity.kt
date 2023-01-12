package com.webkingve.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle as Bundle1
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.buttonClick)
        val textMessage = findViewById<TextView>(R.id.textView)
        var timesCLicked = 0

        btnClick.setOnClickListener{
            timesCLicked += 1
            //textMessage.text = "Hello clicker"
            textMessage.text = timesCLicked.toString()
            Toast.makeText(this, "Hey, i'm toast", Toast.LENGTH_LONG).show()
        }
    }
}