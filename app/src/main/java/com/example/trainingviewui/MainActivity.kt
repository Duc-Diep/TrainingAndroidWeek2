package com.example.trainingviewui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        bottomNavigation.background = null
        bottomNavigation.setOnItemSelectedListener { item ->
            val id = item.itemId
            if (id == R.id.Enviar) {
                val intent: Intent = Intent(this@MainActivity, PayActivity::class.java)
                startActivity(intent)
            } else if (id == R.id.Perfil) {
                val intent: Intent = Intent(this@MainActivity, CardsActivity::class.java)
                startActivity(intent)
            }
            true
        }
    }

}