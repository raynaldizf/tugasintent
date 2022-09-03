package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReset.setOnClickListener{
            resetData()
        }

        btnIntent.setOnClickListener {
            intentPassinData()
        }

        btnBundle.setOnClickListener {
            bundlePassinData()
        }

        btnSerializeAble.setOnClickListener {
            serializeAblePassinData()
        }

        btnParcelAble.setOnClickListener {
            parcelAblePassinData()
        }
    }

    fun hitung(berat: Double, tinggi: Double): Double {
        return berat / ((tinggi * tinggi) * 0.01) * 100
    }

    fun kategori(hitung : Double) : String{
        var kategori=""
        if (hitung < 16.0){
            kategori="Terlalu Kurus"
        }else if (hitung in 16.0..17.0){
            kategori="Cukup Kurus"
        }else if (hitung in 17.0..18.5){
            kategori="Sedikit Kurus"
        }else if (hitung in 18.5..25.0){
            kategori="Normal"
        }else if (hitung in 25.0..30.0){
            kategori="Gemuk"
        }else if (hitung in 30.0..35.0){
            kategori="Obesitas Kelas I"
        }else if (hitung in 35.0..40.0){
            kategori="Obesitas Kelas II"
        }else if (hitung > 40.0){
            kategori="Obesitas Kelas III"
        }
        return kategori
    }

    fun resetData(){
        inputUmur.setText("")
        inputTinggiBadan.setText("")
        inputBeratBadan.setText("")
    }

    fun intentPassinData(){
        val inUmur = inputUmur.text.toString()
        val inTinggi = inputTinggiBadan.text.toString()
        val inBerat = inputBeratBadan.text.toString()
        val hasil = hitung(inBerat.toDouble(),inTinggi.toDouble()).toString()
        val kategori = kategori(hasil.toDouble())

        val inten = Intent(this,IntentActivity::class.java)
        inten.putExtra("umur",inUmur)
        inten.putExtra("tinggi",inTinggi)
        inten.putExtra("berat",inBerat)
        inten.putExtra("hasil",hasil)
        inten.putExtra("kategori",kategori)
        startActivity(inten)

    }

    fun bundlePassinData(){
        val inUmur = inputUmur.text.toString()
        val inTinggi = inputTinggiBadan.text.toString()
        val inBerat = inputBeratBadan.text.toString()
        val hasil = hitung(inBerat.toDouble(),inTinggi.toDouble()).toString()
        val kategori = kategori(hasil.toDouble())

        val bun = Bundle()
        val inten = Intent(this,BundleActivity::class.java)

        bun.putString("umur",inUmur)
        bun.putString("tinggi",inTinggi)
        bun.putString("berat",inBerat)
        bun.putString("hasil",hasil)
        bun.putString("kategori",kategori)

        inten.putExtras(bun)
        startActivity(inten)
    }

    fun serializeAblePassinData(){
        val inUmur = inputUmur.text.toString()
        val inTinggi = inputTinggiBadan.text.toString()
        val inBerat = inputBeratBadan.text.toString()
        val hasil = hitung(inBerat.toDouble(),inTinggi.toDouble()).toString()
        val kategori = kategori(hasil.toDouble())

        val inten = Intent(this, SerializeAbleActivity::class.java)
        val data = MahasiswaSerializeAble(inUmur,inTinggi,inBerat,hasil,kategori)

        inten.putExtra("datamahasiswa",data)
        startActivity(inten)
    }

    fun parcelAblePassinData(){
        val inUmur = inputUmur.text.toString()
        val inTinggi = inputTinggiBadan.text.toString()
        val inBerat = inputBeratBadan.text.toString()
        val hasil = hitung(inBerat.toDouble(),inTinggi.toDouble()).toString()
        val kategori = kategori(hasil.toDouble())

        val inten = Intent(this,ParcelAbleActivity::class.java)
        val data = PersonParcelAble(inUmur,inTinggi,inBerat,hasil,kategori)

        inten.putExtra("dataperson",data)
        startActivity(inten)
    }
}