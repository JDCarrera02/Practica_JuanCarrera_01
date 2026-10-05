package org.iesch.apppractica.Model

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize
data class SuperHeroe(
    val nombre: String,
    val alterEgo: String,
    val bio: String,
    val power: Float
) : Parcelable
