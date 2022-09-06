package com.vamsi.roomlayer

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Character::class], version = 1, exportSchema = false)
abstract class CharacterDatabase : RoomDatabase(){
    abstract fun charDao(): RoomDao
}