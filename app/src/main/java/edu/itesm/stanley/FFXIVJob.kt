package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FFXIVJob(val picture:Int, val name:String, val type:String, val description: String): Parcelable