package com.ervens.firstsimpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image  = findViewById(R.id.shape)
        val button: Button = findViewById(R.id.changeColorButton)

        button.setOnClickListener{
            changeColor()
        }
    }

    private fun changeColor() {
        val randomInt = Random.nextInt(4) + 1
        val imageResource = when (randomInt) {
            1 -> R.drawable.blue_shape
            2 -> R.drawable.green_shape
            3 -> R.drawable.red_shape
            else -> R.drawable.yellow_shape
        }
        image.setImageResource(imageResource)
    }
}