package com.github.novotnyr.kocka

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.rollButton)
    }

    fun onRollButtonClick(view: View) {
        val randomRoll = Random.nextInt(0, 5) + 1
        rollButton.text = randomRoll.toString()
    }
}