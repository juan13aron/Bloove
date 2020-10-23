package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_menu.*

class MainActivity : AppCompatActivity() {
    var sampleImages : IntArray = intArrayOf(
        R.drawable.paris,
        R.drawable.dubai,
        R.drawable.uk,
        R.drawable.moscow
    )

    var cities : Array<String> = arrayOf(
        "Paris",
        "Dubai",
        "United kingdom",
        "Moscow"
    )
    var sampleImages2 : IntArray = intArrayOf(
        R.drawable.hk,
        R.drawable.hm,
        R.drawable.ho,
        R.drawable.ht
    )
    var hospitales : Array<String> = arrayOf(
        "Hospital Kennedy",
        "Hospital Meredi",
        "Hospital Oriente",
        "Hospital Tunal"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        carouselView.pageCount = cities.size

        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }
        carouselView.setImageClickListener { position ->
            Toast.makeText(applicationContext, cities[position], Toast.LENGTH_SHORT).show()
        }

        carouselView2.pageCount = hospitales.size

        carouselView2.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages2[position])
        }
        carouselView2.setImageClickListener { position ->
            Toast.makeText(applicationContext, hospitales[position], Toast.LENGTH_SHORT).show()
        }


        requisitos.setOnClickListener {
            val intent: Intent = Intent(this, Requisitos_View::class.java)
            startActivity(intent)
        }
        incentivos.setOnClickListener {
            val intent: Intent = Intent(this, Incentivos_View::class.java)
            startActivity(intent)
        }
        localizacion.setOnClickListener {
            val intent: Intent = Intent(this, Localizacion_View::class.java)
            startActivity(intent)
        }
        tiposRH.setOnClickListener {
            val intent: Intent = Intent(this, Tipos_RH::class.java)
            startActivity(intent)
        }
        fab.setOnClickListener {
            val intent: Intent = Intent(this, Informacion_View::class.java)
            startActivity(intent)
        }




    }
}