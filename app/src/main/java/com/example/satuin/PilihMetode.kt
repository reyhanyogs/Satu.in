package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.satuin.R

class PilihMetode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_metode)
        val keDMS = findViewById<Button>(R.id.btnsendiri)
        keDMS.setOnClickListener {
            val intent = Intent(this, DetailMakananSendiri::class.java)
            startActivity(intent)
        }
        val keDMP = findViewById<Button>(R.id.btnpatungan)
        keDMP.setOnClickListener {
            val intent = Intent(this, DetailMakananPatungan::class.java)
            startActivity(intent)
        }
    }
}