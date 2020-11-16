package db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Estudiantes")
data class EstudianteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val Nombre: String,
    val dni: String,
    val direccion: String
)
