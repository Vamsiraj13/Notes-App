package com.vamsi.roomlayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharAdapter(val list: List<CharInfo>) : RecyclerView.Adapter<CharAdapter.VHolder>() {
    class VHolder(view : View):  RecyclerView.ViewHolder(view){
        val c_name = view.findViewById<TextView>(R.id.cardname)
        val c_height = view.findViewById<TextView>(R.id.cardheight)
        val c_anime = view.findViewById<TextView>(R.id.cardanime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cards, parent, false)
        return VHolder(view)
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.c_name.text = list[position].name
        holder.c_height.text = list[position].height.toString()
        holder.c_anime.text = list[position].anime
    }

    override fun getItemCount(): Int {
        return list.size
    }
}