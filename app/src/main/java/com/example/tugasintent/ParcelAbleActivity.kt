package com.example.tugasintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parcel_able.*

class ParcelAbleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcel_able)

        getData()
    }

    @SuppressLint("SetTextI18n")
    fun getData(){
        val dataperson = intent.getParcelableExtra("dataperson") as PersonParcelAble?
        txtoutputUmur.text ="Umur anda : "+ dataperson?.umur.toString()
        txtoutputTinggi.text ="Tinggi : "+dataperson?.tinggi.toString()
        txtoutputBeratBadan.text ="Berat Badan : "+ dataperson?.berat.toString()
        txtoutputHasilBmi.text ="BMI anda : "+ dataperson?.hasil.toString()
        txtoutputKategori.text ="Kategori : "+ dataperson?.kategori.toString()

    }
}