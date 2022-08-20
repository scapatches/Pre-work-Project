package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R.color.purple_500

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Maria" , "Tapped On Button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))


        }
     // findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(purple_500))
    }

}