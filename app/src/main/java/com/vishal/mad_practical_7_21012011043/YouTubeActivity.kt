package com.vishal.mad_practical_7_21012011043

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)
        val youtubeWebView=findViewById<WebView>(R.id.webView)
        val webSettings:WebSettings=youtubeWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        val Id = "fJn9B64Znrk"
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$Id")

        val button=findViewById<FloatingActionButton>(R.id.floatingActionButton)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).apply { startActivity(this) }
        }
    }
}