package db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Car(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val marca: String,
    val modelo: String,
    val color: String



)