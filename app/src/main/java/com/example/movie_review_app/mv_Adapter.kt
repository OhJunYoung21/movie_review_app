package com.example.movie_review_app


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class mv_Adapter(val itemlist: ArrayList<movie>) :
    RecyclerView.Adapter<mv_Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.movie_name.text = itemlist[position].name
        holder.movie_actor.text = itemlist[position].actor

    }


    override fun getItemCount(): Int {
        return itemlist.size
    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val movie_name = view.findViewById<TextView>(R.id.tv_name)
        val movie_actor = view.findViewById<TextView>(R.id.tv_number)

    }
}