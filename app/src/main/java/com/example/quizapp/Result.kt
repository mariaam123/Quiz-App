package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        congo.text="გილოცავთ ${userName} !!"
        Score.text="${score} / ${totalQuestion}"
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}