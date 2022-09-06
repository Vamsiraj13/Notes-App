package com.vamsi.roomlayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.android.synthetic.main.activity_overview.*
import kotlinx.android.synthetic.main.activity_overview.view.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Overview : AppCompatActivity() {
    private lateinit var database: CharacterDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)
        database = Room.databaseBuilder(
            applicationContext, CharacterDatabase::class.java, "Character_Database"
        ).build()
        button.setOnClickListener{
            if(name.text.toString().isNotEmpty() && height.text.toString().isNotEmpty() && anime.text.toString().isNotEmpty()){
                val namai = name.text.toString()
                val takasa = height.text.toString()
                val anime = anime.text.toString()
                CharObject.setData(namai, takasa.toInt(), anime)
                GlobalScope.launch {
                    database.charDao().insertChar(Character("Kiyotaka", 171, "COTE"))
                }
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}