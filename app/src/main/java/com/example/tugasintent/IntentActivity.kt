package com.example.tugasintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        getData()
    }

    @SuppressLint("SetTextI18n")
    fun getData(){
        val outputUmur = intent.getStringExtra("umur")
        val outputTinggi = intent.getStringExtra("tinggi")
        val outputBeratBadan = intent.getStringExtra("berat")
        val outputHasilBmi = intent.getStringExtra("hasil")
        val outputKategori = intent.getStringExtra("kategori")

        txtoutputUmur.text = "Umur anda : $outputUmur tahun"
        txtoutputTinggi.text = "Tinggi :  $outputTinggi cm"
        txtoutputBeratBadan.text = "Berat Badan : $outputBeratBadan kg"
        txtoutputHasilBmi.text = "BMI anda : $outputHasilBmi"
        txtoutputKategori.text = "Kategori : $outputKategori"
    }
}