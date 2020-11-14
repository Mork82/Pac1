package db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CarDao {
    @Query ("SELECT * FROM Car")
    fun getAll() : List<Car>

    @Insert()
    fun update (car:List<Car>)

}