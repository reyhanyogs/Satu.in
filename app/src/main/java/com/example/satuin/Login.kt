package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val BalikDaftar = findViewById<Button>(R.id.DaftarbuttonLogin)
        val mulaiButton = findViewById<Button>(R.id.MulaiButton)
        BalikDaftar.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        mulaiButton.setOnClickListener {
            val intent = Intent(this, HomepagePenjual::class.java)
            startActivity(intent)
        }
    }
}