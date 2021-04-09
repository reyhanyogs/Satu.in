package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PenarikanSaldo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penarikan_saldo)
        val buttonSebelumnya = findViewById<Button>(R.id.balikSebelumnya)
        buttonSebelumnya.setOnClickListener {
            val intent = Intent(this, HomepagePenjual::class.java)
            startActivity(intent)
        }
    }
}