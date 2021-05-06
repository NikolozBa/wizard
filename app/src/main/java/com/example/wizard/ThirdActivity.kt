package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {

    lateinit var editEmail: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        editEmail = findViewById(R.id.editEmail)
        button = findViewById(R.id.buttonEmail)
        val name = intent.extras?.getString("NAME")
        val age = intent.extras?.getInt("AGE")

        button.setOnClickListener {

            if (editEmail.text.isEmpty()) {
                return@setOnClickListener
            }

            val email: String = editEmail.text.toString()
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("EMAIL", email)

            startActivity(intent)
        }
    }
}