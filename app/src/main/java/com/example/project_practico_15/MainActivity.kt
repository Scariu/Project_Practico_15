package com.example.project_practico_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/* Pasos para crear recycleView
* 1.[x]Item layout
* 2.[x]layout con recyclerView
* 3.[x]Asignar layout manager
* 4.[]Adapter + ViewHolder
* 5.[]Tener disponibles los datos
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}