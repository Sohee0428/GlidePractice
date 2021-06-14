package com.example.glidepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        인터넷에 있는 이미지를 이미지뷰에 바로 대입

        Glide.with(this).load("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png\uFEFF").into(GoogleImg)
    }
}