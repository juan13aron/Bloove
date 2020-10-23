package com.teamblue.projectbloove

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.imageView
import kotlinx.android.synthetic.main.item_1.view.*
import java.text.FieldPosition


class Requi1Adapter(private val mContext: Context, private val listas: List<lista1>) : ArrayAdapter<lista1>(mContext, 0, listas){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{
        val layout= LayoutInflater.from(mContext).inflate(R.layout.item_1, parent, false)

        val lista1 = listas[position]

        layout.descripcion.text =  lista1.descripcion
        layout.imageView.setImageResource(lista1.image)

        return layout
    }
}