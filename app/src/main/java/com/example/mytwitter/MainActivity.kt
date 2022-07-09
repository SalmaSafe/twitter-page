package com.example.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()

    }
    fun displayTweet(){
        var tweet1= Tweet("","10 min","Stacey Edward","@Stace","12.1K","10","1.5K","12.1K","I love being in my 20s. Just a whole decade of being in my physical prime and mental rock bottom. What a dynamic")
        var tweet2= Tweet("","1 min","Kelsie Rodrigez","@Kell","1000K","1K","1.5K","12.1K","Always seek the approval of others. It fills the emptiness inside you, it also makes the emptiness larger so it can hold more approval")
        var tweet3= Tweet("","2 days","Davion Martin","@Dave","992","5K","1.5K","12.1K","Imagine having kids. creating a whole new person who has to sit in traffic and go to work and have feelings. Sadistic")
        var tweet4= Tweet("","7 min","Daphnie Benard","@Daph","2K","150","1.5K","12.1K","It-is-what-it-is-ing my way through the collapse of civilization")
        var tweetList =
            listOf(tweet1,tweet2,tweet3,tweet4)
        var tweetAdapter= TweetRvAdapter(tweetList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }
}


