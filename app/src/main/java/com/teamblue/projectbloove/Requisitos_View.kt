package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_requisitos__view.*
import kotlinx.android.synthetic.main.item_1.*
import kotlinx.android.synthetic.main.item_1.view.*



class Requisitos_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requisitos__view)

        val re1 = lista1("Ser mayor de 18", R.drawable.list_1 )
        val re2 = lista1(" No sintomas de fiebre", R.drawable.termometer )
        val re3 = lista1("Tener buen estado de salud", R.drawable.corazon )
        val re4 = lista1("No haberse hecho tatuaje o piercing", R.drawable.tatto )
        val re5 = lista1("Analisis de hemoglobina", R.drawable.hemoglo )

        val listas = listOf(re1, re2, re3, re4, re5)
        val adapter =  Requi1Adapter(this,listas)

        listRequis.adapter = adapter


        back_button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}