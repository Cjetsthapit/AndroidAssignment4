package com.sthapit.srijeetsthapit_mapd711_assignment4

import AdminRepository
import AdminViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.goldstein.room2.viewmodel.AdminViewModelFactory
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityAdminLoginBinding
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityAdminRegisterBinding
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.Admin

class AdminRegister : AppCompatActivity() {

    private lateinit var adminViewModel: AdminViewModel
    private lateinit var binding: ActivityAdminRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adminDao = AppDatabase.getDatabase(application).adminDao()
        val repository = AdminRepository(adminDao)

        adminViewModel = ViewModelProvider(this, AdminViewModelFactory(repository))[AdminViewModel::class.java]

        binding.registerAdmin.setOnClickListener(){
            val newUser = Admin(userName = "srijeet_sthapit", email = "srijeet@gmail.com", password = "password123", firstName = "Srijeet", lastName="Sthapit")
            adminViewModel.registerAdmin(newUser)
        }



    }
}