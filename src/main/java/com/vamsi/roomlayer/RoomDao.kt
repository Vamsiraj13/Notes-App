package com.vamsi.roomlayer

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RoomDao {
    @Insert
    fun insertChar(char: Character)

    @Delete
    fun deleteChar(char: Character)

    @Query("Select * From `Favorite Characters`")
    fun displayChar(): List<Character>
}