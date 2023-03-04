package com.example.movie_review_app


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class mv_Adapter(val itemlist: ArrayList<Movie>) :
    RecyclerView.Adapter<mv_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie, parent, false)
        return ViewHolder(view)
    }


    @SuppressLint("NotifyDataSetChanged", "DiscouragedApi")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ct = holder.photo.context

        val id = ct.resources.getIdentifier(holder.photo.toString(), "drawable", ct.packageName)
        holder.photo.setImageResource(id)

        holder.movie_name.text = itemlist[position].name
        holder.movie_actor.text = itemlist[position].actor


        holder.delete.setOnClickListener {
            itemlist.removeAt(position)
            notifyDataSetChanged()
        }


        holder.movie_review.setOnClickListener {

            val intent = Intent(holder.movie_review?.context, ReviewActivity::class.java)
            intent.putExtra("제목", itemlist[position].name)
            intent.putExtra("배우", itemlist[position].actor)
            ContextCompat.startActivity(holder.movie_review.context, intent, null)
        }

    }


    override fun getItemCount(): Int {
        return itemlist.size
    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        val photo = view.findViewById<ImageView>(R.id.image)
        val movie_name = view.findViewById<TextView>(R.id.tv_name)
        val movie_actor = view.findViewById<TextView>(R.id.tv_actor)
        val movie_review = view.findViewById<TextView>(R.id.review)
        val delete = view.findViewById<TextView>(R.id.deletion)


    }
}