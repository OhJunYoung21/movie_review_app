package com.example.movie_review_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class mv_Adapter(val itemlist: ArrayList<movie>) : RecyclerView.Adapter<mv_Adapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = itemlist[position].name
        holder.actor.text = itemlist[position].actor
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name = view.findViewById<TextView>(R.id.tv_name)
        val actor = view.findViewById<TextView>(R.id.tv_number)

    }
}