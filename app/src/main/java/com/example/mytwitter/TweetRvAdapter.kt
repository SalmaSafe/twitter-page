package com.example.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweetList: List<Tweet>): RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
      var itemView = LayoutInflater.from(parent.context)
          .inflate(R.layout.tweet_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
       var currentTweet=tweetList.get(position)
        holder.tvName.text =currentTweet.name
        holder.tvLikes.text =currentTweet.likes
        holder.tvComment.text =currentTweet.comment
        holder.tvHandle.text=currentTweet.handle
        holder.tvTime.text=currentTweet.time
        holder.tvTweet.text=currentTweet.tweet
        holder.tvRetweet.text=currentTweet.retweet
    }

    override fun getItemCount(): Int {
        return tweetList.size

    }

}
class TweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
   var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var ivAvatar = itemView.findViewById<ImageView>(R.id.ivAvatar)
    var ivComment = itemView.findViewById<ImageView>(R.id.ivComment)
    var ivRetweet = itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivLike = itemView.findViewById<ImageView>(R.id.ivLike)
    var ivShare= itemView.findViewById<ImageView>(R.id.ivShare)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTime =itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet =itemView.findViewById<TextView>(R.id.tvtweet)
    var tvRetweet = itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvComment = itemView.findViewById<TextView>(R.id.tvComments)
    var tvLikes = itemView.findViewById<TextView>(R.id.tvLikes)

}