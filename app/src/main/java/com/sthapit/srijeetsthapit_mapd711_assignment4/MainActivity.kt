package com.sthapit.srijeetsthapit_mapd711_assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginAdmin.setOnClickListener(){
            val intent =  Intent(this, AdminLogin::class.java)
            startActivity(intent)
        }

        binding.loginCustomer.setOnClickListener(){
            val intent =  Intent(this, CustomerLogin::class.java)
            startActivity(intent)
        }

        binding.registerAdmin.setOnClickListener(){
            val intent =  Intent(this, AdminRegister::class.java)
            startActivity(intent)
        }

        binding.registerCustomer.setOnClickListener(){
            val intent =  Intent(this, CustomerRegister::class.java)
            startActivity(intent)
        }
    }
}