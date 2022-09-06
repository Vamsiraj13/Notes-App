package com.vamsi.roomlayer

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Favorite Characters")
class Character (
       @PrimaryKey
       var name: String,
       var height: Int,
       var anime: String
        )
