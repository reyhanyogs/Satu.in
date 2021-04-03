package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PembayaranGagal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_gagal)
        val BalikPM = findViewById<Button>(R.id.btnbackpg)
        BalikPM.setOnClickListener {
            val intent = Intent(this, PilihMetode::class.java)
            startActivity(intent)
        }
    }
}