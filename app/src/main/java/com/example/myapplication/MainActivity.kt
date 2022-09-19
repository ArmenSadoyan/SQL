package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // Объявим переменные компонентов
    var button: Button? = null
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Найдем компоненты в XML разметке
        button = findViewById<View>(R.id.button) as Button
        textView = findViewById<View>(R.id.textView) as TextView

        // Пропишем обработчик клика кнопки
        button!!.setOnClickListener { }
    }
}