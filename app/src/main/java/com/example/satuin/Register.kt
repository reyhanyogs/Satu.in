package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val BalikLogin = findViewById<Button>(R.id.BalikLogin)
        BalikLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val Register = findViewById<Button>(R.id.DaftarButton)
        Register.setOnClickListener {
            val i = Intent(this,ProfilUsaha::class.java)
            startActivity(i)
        }
    }
}