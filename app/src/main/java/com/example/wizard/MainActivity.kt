package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editName: EditText;
    lateinit var button: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editName)
        button = findViewById(R.id.buttonName)

        button.setOnClickListener {

            if (editName.text.isEmpty()) {
                return@setOnClickListener
            }

            val name: String = editName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)

            startActivity(intent)
        }

    }
}