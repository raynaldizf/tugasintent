package com.example.tugasintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serialize_able.*

class SerializeAbleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serialize_able)

        getData()
    }

    @SuppressLint("SetTextI18n")
    fun getData(){
        val data = intent.getSerializableExtra("datamahasiswa") as MahasiswaSerializeAble
        txtoutputUmur.text = "Umur anda: ${data.umur} tahun"
        txtoutputTinggi.text = "Tinggi :  ${data.tinggi} cm"
        txtoutputBeratBadan.text = "Berat Badan : ${data.berat} kg"
        txtoutputHasilBmi.text = "BMI anda : ${data.hasil}"
        txtoutputKategori.text = "Kategori : ${data.kategori}"
    }
}