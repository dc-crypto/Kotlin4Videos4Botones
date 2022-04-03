package com.diegocastro.kotlin4videos4botones

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView: VideoView =findViewById(R.id.myVideoView)
        val btn_video1:Button=findViewById(R.id.btn_video1)
        val btn_video2:Button=findViewById(R.id.btn_video2)
        val btn_video3:Button=findViewById(R.id.btn_video3)
        val btn_video4:Button=findViewById(R.id.btn_video4)

        val ruta1:String="android.resource://"+packageName+"/"+R.raw.video1
        val ruta2:String="android.resource://"+packageName+"/"+R.raw.video2
        val ruta3:String="android.resource://"+packageName+"/"+R.raw.video3
        val ruta4:String="android.resource://"+packageName+"/"+R.raw.video4
        //val videoUri:Uri=Uri.parse(ruta)
        //myVideoView.setVideoURI(videoUri)

        btn_video1.setOnClickListener{
            val videoUri:Uri=Uri.parse(ruta1)
            myVideoView.setVideoURI(videoUri)

        }

        btn_video2.setOnClickListener{
            val videoUri:Uri=Uri.parse(ruta2)
            myVideoView.setVideoURI(videoUri)

        }
        btn_video3.setOnClickListener{
            val videoUri:Uri=Uri.parse(ruta3)
            myVideoView.setVideoURI(videoUri)

        }

        btn_video4.setOnClickListener{
            val videoUri:Uri=Uri.parse(ruta4)
            myVideoView.setVideoURI(videoUri)
        }
        //metodo para que comience el video
        myVideoView.setOnPreparedListener{
            myVideoView.start()
        }

        //agregar los controles de video
        val mediaController= MediaController(this)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)

        //metodo para que indique el fin del video
        myVideoView.setOnCompletionListener {
            Toast.makeText(this, "Video finalizado", Toast.LENGTH_SHORT).show()
        }



    }

}

