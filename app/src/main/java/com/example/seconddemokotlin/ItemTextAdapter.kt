package com.example.seconddemokotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemTextAdapter(val userList: ArrayList<User>) :RecyclerView.Adapter<ItemTextAdapter.TextHolder>() {
    class TextHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.tvItem) as TextView
            textViewName.text = user.item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false)
        return TextHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        holder.bindItems(userList[position])
    }
}