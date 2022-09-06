package com.vamsi.roomlayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var database:CharacterDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(applicationContext, CharacterDatabase::class.java, "Character_Database").build()
        GlobalScope.launch {
            database.charDao().insertChar(Character("Kiyotaka", 171, "COTE"))
        }
        floatingActionButton.setOnClickListener{
            val intent = Intent(this, Overview::class.java)
            startActivity(intent)
        }
        recycler.adapter = CharAdapter(CharObject.getData())
        recycler.layoutManager = LinearLayoutManager(this)
     }
}