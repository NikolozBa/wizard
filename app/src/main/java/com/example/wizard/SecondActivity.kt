package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    lateinit var editAge: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        editAge = findViewById(R.id.editAge)
        button = findViewById(R.id.buttonAge)
        val name = intent.extras?.getString("NAME")

        button.setOnClickListener {

            if(editAge.text.isEmpty()){
                return@setOnClickListener
            }

            val age : Int = editAge.text.toString().toInt()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)

            startActivity(intent)
        }
    }
}