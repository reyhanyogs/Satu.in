package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailMakananPatungan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan_patungan)
        val BalikPM = findViewById<Button>(R.id.btnbackdmp)
        BalikPM.setOnClickListener {
            val intent = Intent(this, PilihMetode::class.java)
            startActivity(intent)
        }
    }
}