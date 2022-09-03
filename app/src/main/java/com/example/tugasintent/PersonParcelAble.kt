package com.example.tugasintent

import android.os.Parcel
import android.os.Parcelable

data class PersonParcelAble(var umur: String?, var tinggi: String?, var berat: String?, var hasil: String?, var kategori: String?) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(umur)
        parcel.writeString(tinggi)
        parcel.writeString(berat)
        parcel.writeString(hasil)
        parcel.writeString(kategori)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcelAble> {
        override fun createFromParcel(parcel: Parcel): PersonParcelAble {
            return PersonParcelAble(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcelAble?> {
            return arrayOfNulls(size)
        }
    }
}
