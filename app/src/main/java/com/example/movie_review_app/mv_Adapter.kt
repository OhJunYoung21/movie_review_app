package com.example.movie_review_app


import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class mv_Adapter(val itemlist: ArrayList<movie>) :
    RecyclerView.Adapter<mv_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie, parent, false)
        return ViewHolder(view)
    }


    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.movie_order.text = itemlist[position].number
        holder.movie_name.text = itemlist[position].name
        holder.movie_actor.text = itemlist[position].actor



        holder.delete.setOnClickListener {
            itemlist.removeAt(position)
            notifyDataSetChanged()
        }



    }


    override fun getItemCount(): Int {
        return itemlist.size
    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        val movie_order = view.findViewById<TextView>(R.id.order)
        val movie_name = view.findViewById<TextView>(R.id.tv_name)
        val movie_actor = view.findViewById<TextView>(R.id.tv_actor)
        val movie_review = view.findViewById<TextView>(R.id.review)
        val delete = view.findViewById<TextView>(R.id.deletion)

    }
}