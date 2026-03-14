package com.example.static_version

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // cambiar el layout a la pantalla que se quiere ver
        setContentView(R.layout.activity_creador)
    }
}