package com.movil.superhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.movil.superhero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonGuardar.setOnClickListener{
            openDetailActivity()
        }

    }
    private fun openDetailActivity(){
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}