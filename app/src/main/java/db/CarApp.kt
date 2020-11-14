package db

import android.app.Application
import androidx.room.Room

class CarApp : Application(){

    val room= Room.databaseBuilder(this, CarDB::class.java,
        "car").build()
}