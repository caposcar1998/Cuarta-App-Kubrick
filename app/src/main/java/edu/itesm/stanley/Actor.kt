package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Actor(val picture:Int, val nombre:String, val edad:String, val historia: String) : Parcelable