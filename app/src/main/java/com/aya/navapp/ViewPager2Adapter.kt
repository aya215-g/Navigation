package com.aya.navapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(var viewList:List<ViewPager>) :
    RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var image=itemView.findViewById<ImageView>(R.id.imageViewpager2)
            var txt=itemView.findViewById<TextView>(R.id.textViewpager2)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_viewpagger2_layout,parent, false))
        }
        override fun getItemCount(): Int {
           return viewList.size
        }
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            var postion1=viewList[position]
            holder.itemView.apply {
                holder.image.setImageResource(postion1.img)
                holder.txt.text=postion1.txt
            }
        }

}