package com.example.kursapp

import android.app.Activity
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{
            var message = Toast.makeText(applicationContext, "wiadomosc", Toast.LENGTH_LONG);
            message.show();

            var newAktywnosc: Intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(newAktywnosc)

        }

        move_button.setOnClickListener{
            var message = Toast.makeText(applicationContext, "krotka", Toast.LENGTH_SHORT);
            message.show();

            val address = "https://www.youtube.com/channel/UCZHHfVxOTL40lqR_Kh3fg9A"
            var channelYt = Intent(ACTION_VIEW, Uri.parse(address))
            startActivity(channelYt)

        }


    }


}
