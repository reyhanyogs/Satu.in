package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GettingStarted2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getting_started2)
        val Penjual = findViewById<Button>(R.id.penjualButton)
        Penjual.setOnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
        val loginPembeli = findViewById<Button>(R.id.pembeliButton)
        loginPembeli.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}