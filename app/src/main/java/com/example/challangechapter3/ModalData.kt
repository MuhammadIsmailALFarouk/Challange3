package com.example.challangechapter3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.text.NumberFormat
import java.util.*
@Parcelize
data class ModalData(var namaMakanan:String,
                     var hargaMakanan:String,
                     var image:Int,
                     var deskripsi:String,
                     var alamatToko:String
                     ):Parcelable
