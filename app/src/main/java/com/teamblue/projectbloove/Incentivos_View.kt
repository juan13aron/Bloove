package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_incentivos__view.*
import kotlinx.android.synthetic.main.activity_requisitos__view.*
import kotlinx.android.synthetic.main.activity_requisitos__view.back_button

class Incentivos_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incentivos__view)

        imageView11.setOnClickListener{
            imageView11.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView11.animate().apply {
                duration = 1000
                rotationXBy(360f)
                }.start()
            }
        }

        imageView12.setOnClickListener{
            imageView12.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView12.animate().apply {
                    duration = 1000
                    rotationXBy(360f)
                }.start()
            }
        }

        imageView8.setOnClickListener{
            imageView8.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView8.animate().apply {
                    duration = 1000
                    rotationXBy(360f)
                }.start()
            }
        }


        imageView6.setOnClickListener{
            imageView6.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView6.animate().apply {
                    duration = 1000
                    rotationXBy(360f)
                }.start()
            }
        }

        imageView10.setOnClickListener{
            imageView10.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView10.animate().apply {
                    duration = 1000
                    rotationXBy(360f)
                }.start()
            }
        }
        imageView7.setOnClickListener{
            imageView7.animate().apply {
                duration = 1000
                rotationXBy(360f)
                rotationX(360f)
            }.withEndAction{
                imageView7.animate().apply {
                    duration = 1000
                    rotationXBy(360f)
                }.start()
            }
        }


        back_button6.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}