package com.vishal.mad_practical_7_21012011043

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController=MediaController(this)
        val uri: Uri=Uri.parse("android.resource://" +packageName+"/"+R.raw.thestoryoflight)
        val myVideoview=findViewById<VideoView>(R.id.videoView)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
       myVideoview.start()
        val button=findViewById<FloatingActionButton>(R.id.floatingActionButton)
        button.setOnClickListener{
            Intent(this,YouTubeActivity::class.java).apply { startActivity(this) }
        }
    }
}