package com.example.crownmediajameschannel.Model.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.crownmediajameschannel.R

class VideosRecyclerViewAdapter() : RecyclerView.Adapter<VideosRecyclerViewAdapter.ViewHolder>() {

    var mockVideoArrayList:ArrayList<String> = ArrayList();

    constructor(mockArrayList:ArrayList<String>) : this(){

        this.mockVideoArrayList = mockArrayList;
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View =   LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_with_cardview_items, parent, false)

        return ViewHolder(itemView);
    }

    override fun getItemCount(): Int {

        return mockVideoArrayList.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mockList = mockVideoArrayList[position]
        holder.textView.text = mockList;

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //Bind the view to the recyclerView
       var textView: TextView = itemView.findViewById(R.id.recyclerItem1TextView)

    }
}