package com.example.numerical_systems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.example.numerical_systems.databinding.ActivityMainBinding
import org.w3c.dom.Text

import java.text.DecimalFormat
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dec()
    }

    private fun dec() {
        binding.editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val input = p0.toString()
                val decimal = input.toDouble()
                val binary = Integer.toBinaryString(decimal.toInt())
                val octal = Integer.toOctalString(decimal.toInt())
                val hexadecimal = Integer.toHexString(decimal.toInt())
                binding.editText2.setText(binary)
                binding.editText3.setText(octal)
                binding.editText4.setText(hexadecimal)


            }

            override fun afterTextChanged(p0: Editable?) {


            }
        })


    }
}