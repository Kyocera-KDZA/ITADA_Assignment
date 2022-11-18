package com.itadab4.jwfy27zw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import android.content.Intent
import android.widget.Button


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnReg = findViewById<Button>(R.id.btn_register)
        btnReg.setOnClickListener {
            val intent = Intent (this,RegisterActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}