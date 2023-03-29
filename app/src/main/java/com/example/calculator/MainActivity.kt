package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var resultView: TextView
    var result: Double = 0.0
    var number1: Double = 0.0
    var number2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpViews()


    }

    private fun setUpViews() {

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        resultView = findViewById(R.id.resultView)

        binding.addition.setOnClickListener { add() }
        binding.multiplication.setOnClickListener { multiply() }
        binding.division.setOnClickListener { divide() }
        binding.subtraction.setOnClickListener { subtract() }

    }

    fun resetValues() {

        number1 = 0.0
        number2 = 0.0
        result = 0.0

        if (!binding.input1.text.toString().isNullOrEmpty() && !binding.input2.text.toString()
                .isNullOrEmpty()
        ) {
            number1 = binding.input1.text.toString().toDouble()
            number2 = binding.input2.text.toString().toDouble()
        } else {
            Toast.makeText(this, "Please Enter Numbers Correctly", Toast.LENGTH_SHORT).show()
        }

    }

    fun add() {

        resetValues()
        result = number1 + number2
        binding.resultView.text = result.toInt().toString()
    }


    fun multiply() {

        resetValues()
        result = number1 * number2
        binding.resultView.text = result.toInt().toString()

    }

    fun divide() {

        resetValues()
        result = number1 / number2
        binding.resultView.text = result.toString()


    }

    fun subtract() {

        resetValues()
        result = number1 - number2.toInt().toDouble()
        binding.resultView.text = result.toString()
    }


}