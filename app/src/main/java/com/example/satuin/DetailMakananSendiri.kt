package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailMakananSendiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan_sendiri)
        val BalikPM = findViewById<Button>(R.id.btnbackdms)
        BalikPM.setOnClickListener {
            val intent = Intent(this, PilihMetode::class.java)
            startActivity(intent)
        }
    }
}