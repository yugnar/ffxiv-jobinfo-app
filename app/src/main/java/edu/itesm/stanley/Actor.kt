package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Actor(val picture:Int, val nombre:String, val pelicula:String, val bio: String): Parcelable

