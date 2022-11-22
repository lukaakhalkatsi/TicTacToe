package com.example.tictactoe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    var player = "p1"
    var score = 1
    var score1 = 1
    private lateinit var but1: Button
    private lateinit var but2: Button
    private lateinit var but3: Button
    private lateinit var but4: Button
    private lateinit var but5: Button
    private lateinit var but6: Button
    private lateinit var but7: Button
    private lateinit var but8: Button
    private lateinit var but9: Button
    private lateinit var btnReset: Button
    private lateinit var txtResult: TextView
    private lateinit var Xscore: TextView
    private lateinit var Oscore: TextView
    private lateinit var firsttextview: TextView
    private lateinit var secondtextview: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        but1 = findViewById(R.id.b1)
        but2 = findViewById(R.id.b2)
        but3 = findViewById(R.id.b3)
        but4 = findViewById(R.id.b4)
        but5 = findViewById(R.id.b5)
        but6 = findViewById(R.id.b6)
        but7 = findViewById(R.id.b7)
        but8 = findViewById(R.id.b8)
        but9 = findViewById(R.id.b9)
        btnReset = findViewById(R.id.btnReset)
        txtResult = findViewById(R.id.txtResult)
        Xscore = findViewById(R.id.score)
        Oscore = findViewById(R.id.score1)
        firsttextview = findViewById(R.id.textView3)
        secondtextview = findViewById(R.id.textView2)


        but1.setOnClickListener {
            buttonClicked(but1)
        }
        but2.setOnClickListener {
            buttonClicked(but2)
        }
        but3.setOnClickListener {
            buttonClicked(but3)
        }
        but4.setOnClickListener {
            buttonClicked(but4)
        }
        but5.setOnClickListener {
            buttonClicked(but5)
        }
        but6.setOnClickListener {
            buttonClicked(but6)
        }
        but7.setOnClickListener {
            buttonClicked(but7)
        }
        but8.setOnClickListener {
            buttonClicked(but8)
        }
        but9.setOnClickListener {
            buttonClicked(but9)
        }
        btnReset.setOnClickListener {
            reset()
            txtResult.text = ""
        }

        val userName = intent.getStringExtra("username")
        val secondName = intent.getStringExtra("secondname")

        firsttextview.text = "$userName"
        secondtextview.text = "$secondName"
    }

    fun buttonClicked(btn: Button){
        if(btn.text == ""){
            if (player=="p1"){
                player = "p2"
                btn.text = "X"
            }else {
                player = "p1"
                btn.text = "O"
            }
        }
        win()
    }


    fun win(){
        if((but1.text == "X" && but2.text == "X" && but3.text == "X")||
            (but4.text == "X" && but5.text == "X" && but6.text == "X")||
            (but7.text == "X" && but8.text == "X" && but9.text == "X")||
            (but1.text == "X" && but5.text == "X" && but9.text == "X")||
            (but3.text == "X" && but5.text == "X" && but7.text == "X")||
            (but1.text == "X" && but4.text == "X" && but7.text == "X")||
            (but2.text == "X" && but5.text == "X" && but8.text == "X")||
            (but3.text == "X" && but6.text == "X" && but9.text == "X")){
            txtResult.text = "X won the Game"
            Xscore.text = "$score"
            score+=1
            disable()
        }
        else if((but1.text == "O" && but2.text == "O" && but3.text == "O")||
            (but4.text == "O" && but5.text == "O" && but6.text == "O")||
            (but7.text == "O" && but8.text == "O" && but9.text == "O")||
            (but1.text == "O" && but5.text == "O" && but9.text == "O")||
            (but3.text == "O" && but5.text == "O" && but7.text == "O")||
            (but1.text == "O" && but4.text == "O" && but7.text == "O")||
            (but2.text == "O" && but5.text == "O" && but8.text == "O")||
            (but3.text == "O" && but6.text == "O" && but9.text == "O")){
            txtResult.text = "O won the Game"
            Oscore.text = "$score1"
            score1+=1
            disable()
        }
        else if (but1.text != ""&& but2.text != "" && but3.text != ""
            && but4.text != "" && but5.text != "" && but6.text != ""
            && but7.text != "" && but8.text != "" && but9.text != ""){
            txtResult.text = "Match Draw/Tie"
            disable()
        }


    }

    fun reset(){
        but1.text = ""
        but2.text = ""
        but3.text = ""
        but4.text = ""
        but5.text = ""
        but6.text = ""
        but7.text = ""
        but8.text = ""
        but9.text = ""
        but1.isEnabled = true
        but2.isEnabled = true
        but3.isEnabled = true
        but4.isEnabled = true
        but5.isEnabled = true
        but6.isEnabled = true
        but7.isEnabled = true
        but8.isEnabled = true
        but9.isEnabled = true
    }

    fun disable(){
        but1.isEnabled = false
        but2.isEnabled = false
        but3.isEnabled = false
        but4.isEnabled = false
        but5.isEnabled = false
        but6.isEnabled = false
        but7.isEnabled = false
        but8.isEnabled = false
        but9.isEnabled = false

    }
}