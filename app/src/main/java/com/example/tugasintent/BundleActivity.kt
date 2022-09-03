package com.example.tugasintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)

        getData()
    }

    @SuppressLint("SetTextI18n")
    fun getData(){
        val bun = intent.extras
        txtoutputUmur.setText("Umur anda : "+bun?.getString("umur"))
        txtoutputTinggi.setText("Tinggi : "+bun?.getString("tinggi"))
        txtoutputBeratBadan.setText("Berat Badan : "+bun?.getString("berat"))
        txtoutputHasilBmi.setText("BMI anda : "+bun?.getString("hasil"))
        txtoutputKategori.setText("Kategori : "+bun?.getString("kategori"))

    }
}