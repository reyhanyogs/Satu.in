package com.example.satuin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomepagePenjual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_penjual)

        val namaUsaha = intent.getStringExtra("namaUsaha")
        val jenisUsaha = intent.getStringExtra("jenisUsaha")
        val namaPenjual = intent.getStringExtra("namaPenjual")
        val alamat = intent.getStringExtra("alamat")
        val textViewNamaUsaha: TextView = findViewById(R.id.NamaUsahaHomepagePenjual)
        val textViewJenisUsaha: TextView = findViewById(R.id.JenisUsahaHomepagePenjual)
        val textViewNamaPenjual: TextView = findViewById(R.id.NamaPenjualHomepagePenjual)
        val textViewAlamat: TextView = findViewById(R.id.AlamatUsahaHomepagePenjual)
        textViewNamaUsaha.text = namaUsaha
        textViewJenisUsaha.text = jenisUsaha
        textViewNamaPenjual.text = namaPenjual
        textViewAlamat.text = alamat
    }
}