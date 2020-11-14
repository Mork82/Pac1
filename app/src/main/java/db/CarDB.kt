package db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Car::class],
    version = 1
)
abstract class CarDB : RoomDatabase() {

    abstract fun  carDao():CarDao


}