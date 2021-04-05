package com.example.satuin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.satuin.fragments.HomeFragment
import com.example.satuin.fragments.ProfileFragment
import com.example.satuin.fragments.RiwayatFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class HomepagePenjual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_penjual)

        val homeFragment = HomeFragment()
        val riwayatFragment = RiwayatFragment()
        val profileFragment = ProfileFragment()
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)


        makeCurrentFragment(homeFragment)
        bottomNavigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.nav_home -> makeCurrentFragment(homeFragment)
                R.id.nav_riwayat -> makeCurrentFragment(riwayatFragment)
                R.id.nav_profile -> makeCurrentFragment(profileFragment)
            }
            true
        }

//        val namaUsaha = intent.getStringExtra("namaUsaha")
//        val jenisUsaha = intent.getStringExtra("jenisUsaha")
//        val namaPenjual = intent.getStringExtra("namaPenjual")
//        val alamat = intent.getStringExtra("alamat")
//        val textViewNamaUsaha: TextView = findViewById(R.id.NamaUsahaHomepagePenjual)
//        val textViewJenisUsaha: TextView = findViewById(R.id.JenisUsahaHomepagePenjual)
//        val textViewNamaPenjual: TextView = findViewById(R.id.NamaPenjualHomepagePenjual)
//        val textViewAlamat: TextView = findViewById(R.id.AlamatUsahaHomepagePenjual)
//        textViewNamaUsaha.text = namaUsaha
//        textViewJenisUsaha.text = jenisUsaha
//        textViewNamaPenjual.text = namaPenjual
//        textViewAlamat.text = alamat
    }
    private fun makeCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_wrapper, fragment)
                commit()
            }
}