
package com.example.mass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

`

        //Declaring all the views
        val ageNumber = findViewById<EditText>(R.id.editTextNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.clear)
        val txtResult = findViewById<TextView>(R.id.result)


        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 52..52 -> "William Shakespeare"
                    in 67..67 -> "Leonardo da Vinci"
                    in 76 ..76  -> "Albert Einstein"
                    in 78 ..78  -> "Mahatma Gandhi "
                    in 51 ..51  -> "Napoleon Bonaparte"
                    in 39..39 -> "Cleopatra"
                    in 56 ..56  -> "Julius Caesar"
                    in 19  ..19  -> "Joan of Arc"
                    in 35..35 -> "Mozart"
                    in 56..56 -> "Abraham Lincoln"
                    in 46 ..46 -> "John F. Kennedy"
                    in 32 ..32  -> "Alexander the Grea"
                    in 84  ..84   -> "Thomas Edison"
                    in 81 ..81  -> "Queen Victoria"


                    else -> "range"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        
                        "William Shakespeare" -> "William Shakespeare: Died at the age of $age in 1616."
                        "Leonardo da Vinci" -> "Leonardo da Vinci: Died at the age of $age in 1519."
                        "Albert Einstein" -> "Albert Einstein: Died at the age of $age in 1955."
                        "Mahatma Gandhi" ->  "Mahatma Gandhi: Died at the age of $age in 1948."
                        "Napoleon Bonaparte" -> "Napoleon Bonaparte: Died at the age of $age in 1821."
                        "Cleopatra" -> "Cleopatra: Died at the age of $age in 30 BCE."
                        "Julius Caesar" ->  "Julius Caesar: Died at the age of $age in 44 BCE."
                        "Joan of Arc" -> "Joan of Arc: Died at the age of $age in 1431."
                        "Mozart" -> "Mozart: Died at the age of $age in 1791."
                        "Abraham Lincoln" -> "Abraham Lincoln: Died at the age of $age in 1865."
                        "John F. Kennedy" -> "John F. Kennedy: Died at the age of $age in 1963."
                        "Alexander the Great" -> "Alexander the Great: Died at the age of $age in 323 BCE."
                        "Cleopatra VII" -> "Cleopatra VII: Died at the age of $age in 30 BCE."
                        "Thomas Edison" -> "Thomas Edison: Died at the age of $age in 1931."
                        "Queen Victoria" -> "Queen Victoria: Died at the age of $age in 1901."
                        
                        
                        
                        else -> "there are no history figures,at that age."
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}

        