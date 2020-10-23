package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_incentivos__view.*
import kotlinx.android.synthetic.main.activity_incentivos__view.back_button6
import kotlinx.android.synthetic.main.activity_requisitos__view.*

class Tipos_RH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos__r_h)

        back_button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}