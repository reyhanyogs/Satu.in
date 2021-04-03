package com.example.satuin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ProfilUsaha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_usaha)
        val registerButton: Button
        var namaUsaha: EditText
        var jenisUsaha: EditText
        var namaPenjual: EditText
        var alamat: EditText
        registerButton = findViewById(R.id.SelanjutnyaButtonPU)
        namaUsaha = findViewById(R.id.editTextNamaUsaha)
        jenisUsaha = findViewById(R.id.editTextJenisUsaha)
        namaPenjual = findViewById(R.id.editTextNamaPenjual)
        alamat = findViewById(R.id.editTextAlamat)
        registerButton.setOnClickListener {
            val intent = Intent (this, HomepagePenjual::class.java)
            val saveNamaUsaha = namaUsaha.text.toString()
            val saveJenisUsaha = jenisUsaha.text.toString()
            val saveNamaPenjual = namaPenjual.text.toString()
            val saveAlamat = alamat.text.toString()
            intent.putExtra("namaUsaha", saveNamaUsaha)
            intent.putExtra("jenisUsaha", saveJenisUsaha)
            intent.putExtra("namaPenjual", saveNamaPenjual)
            intent.putExtra("alamat", saveAlamat)
            startActivity(intent)
        }
    }
}