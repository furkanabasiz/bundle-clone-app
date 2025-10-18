package com.example.bundleclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.bundleclone.data.HomeNews

class HomeRVAdapter (private val mContext: Context, private val homeNewsList:List<HomeNews>)
    : RecyclerView.Adapter<HomeRVAdapter.CardViewDesign>() {

    inner class CardViewDesign(view: View): RecyclerView.ViewHolder(view){

        var homeCardView: CardView
        var newsHeaderText: TextView
        var newsImage: ImageView
        var newsRes: TextView

        init {
            homeCardView = view.findViewById(R.id.homeCardview)
            newsHeaderText = view.findViewById(R.id.newsHeaderText)
            newsImage = view.findViewById(R.id.newsImageView)
            newsRes = view.findViewById(R.id.newsRes)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesign {

        val design = LayoutInflater.from(mContext).inflate(R.layout.home_cardview,
            parent, false)

        return CardViewDesign(design)
    }

    override fun onBindViewHolder(holder: CardViewDesign, position: Int) {

        val header = homeNewsList[position]
        holder.newsHeaderText.text = header.newsHeader

        val res = homeNewsList[position]
        holder.newsRes.text = res.newsRes

        val image = homeNewsList[position]
        holder.newsImage.setImageResource(image.newsImage)
//
//        ("Url yönlendirmesi yapılacak")
    }

    override fun getItemCount(): Int {
        return homeNewsList.size
    }

}