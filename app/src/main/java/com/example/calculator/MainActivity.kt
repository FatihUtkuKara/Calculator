package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var resultView: TextView
    var result: Double = 0.0
    var number1: Int = 0
    var number2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1 = findViewById<EditText>(R.id.input1)
        input2 = findViewById<EditText>(R.id.input2)
        resultView = findViewById<TextView>(R.id.Result)

    }
    fun resetValues() {
        number1 = 0
        number2 = 0
        result = 0.0
        number1 = input1.text.toString().toInt()
        number2 = input2.text.toString().toInt()
    }

    fun add(view: View) {
        if(number1==0 && number2==0)
        {
            Toast.makeText(this, "Please Enter Number Properly", Toast.LENGTH_SHORT).show()
            return
        }
        resetValues()

        result = number1 + number2.toDouble()
        resultView.text = result.toInt().toString()
    }


    fun multiply(view: View) {
        resetValues()

        result = number1 * number2.toDouble()
        resultView.text = result.toInt().toString()

    }

    fun divide(view: View) {
        resetValues()
        result = number1 / number2.toDouble()

        resultView.text = result.toString()


    }

    fun subtract(view: View) {
        resetValues()

        result = number1 - number2.toInt().toDouble()
        resultView.text = result.toString()
    }



}