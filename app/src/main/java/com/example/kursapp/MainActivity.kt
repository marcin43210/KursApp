package com.example.kursapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{
            var message = Toast.makeText(applicationContext, "wiadomosc", Toast.LENGTH_LONG);
            message.show();
        }

        move_button.setOnClickListener{
            var message = Toast.makeText(applicationContext, "krotka", Toast.LENGTH_SHORT);
            message.show();

        }


    }
}
