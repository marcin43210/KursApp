package com.example.kursapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        if(password.isFocused){
            if(password.length() <6 ){
                warn_password.text = "Hasło za krótkie!"
                warn_password.visibility = TextView.VISIBLE
            }else{
                warn_password.text = " Hasło ok!"
                warn_password.visibility = TextView.VISIBLE
            }
        }
    }

}
