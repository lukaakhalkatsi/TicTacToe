package com.example.tictactoe1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var player1: EditText
    private lateinit var player2: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player1 = findViewById(R.id.player1)
        player2 = findViewById(R.id.player2)
        button = findViewById(R.id.button)

        button.setOnClickListener {
                myFunction()
        }

    }

    fun myFunction(){
        var player1name: Boolean = player1.text.toString().length >= 2
        var player2name: Boolean = player2.text.toString().length >= 2

        if(player1name && player2name){
            startActivity(Intent(this, SecondActivity::class.java)
                .putExtra("username", player1.text.toString())
                .putExtra("secondname", player2.text.toString()))
        }else{
            Toast.makeText(this, "შეიყვანე მონაცემები", Toast.LENGTH_SHORT).show()
        }
    }
}