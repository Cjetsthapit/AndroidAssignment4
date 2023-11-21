package com.sthapit.srijeetsthapit_mapd711_assignment4

import AdminRepository
import AdminViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.goldstein.room2.viewmodel.AdminViewModelFactory
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityAdminLoginBinding
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityMainBinding
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.Admin

class AdminLogin : AppCompatActivity() {

    private lateinit var adminViewModel: AdminViewModel
    private lateinit var binding: ActivityAdminLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val adminDao = AppDatabase.getDatabase(application).adminDao()
//        val repository = AdminRepository(adminDao)

//        adminViewModel = ViewModelProvider(this, AdminViewModelFactory(repository))[AdminViewModel::class.java]

        // Example usage
//        val newUser = Admin( email = "john@example.com", password = "password123")
//        adminViewModel.loginAdmin(newUser)

        binding.loginButton.setOnClickListener(){

        }
    }


}