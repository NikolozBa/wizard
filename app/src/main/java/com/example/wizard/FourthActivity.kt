package com.example.wizard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourthActivity : AppCompatActivity() {

    lateinit var name: TextView
    lateinit var age: TextView
    lateinit var email: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        email = findViewById(R.id.email)

        name.text = intent.extras?.getString("NAME")
        age.text = intent.extras?.getInt("AGE").toString()
        email.text = intent.extras?.getString("EMAIL")

    }
}