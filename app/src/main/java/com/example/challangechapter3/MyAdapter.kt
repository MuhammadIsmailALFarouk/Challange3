package com.example.challangechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val listMenu:ArrayList<ModalData>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    var onItemClick : ((ModalData) -> Unit)? = null

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val namaMakanan = itemView.findViewById<TextView>(R.id.namaMakanan)
        val imageDefault = itemView.findViewById<ImageView>(R.id.image_default)
        val hargaMakanan = itemView.findViewById<TextView>(R.id.hargaMakanan)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_menu_linear,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMenu.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var current = listMenu[position]
        holder.imageDefault.setImageResource(current.image)
        holder.hargaMakanan.text = current.hargaMakanan.toString()
        holder.namaMakanan.text = current.namaMakanan

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(current)

        }


    }

}
