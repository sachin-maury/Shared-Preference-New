package com.hedroid.prefrencesshared

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hedroid.prefrencesshared.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val editor = getSharedPreferences("MY_SETTINGS", MODE_PRIVATE)
        binding.textView.setText("Hey your E-mail is : ${editor.getString("email",null)}" +
        "And your password is :${editor.getString("password",null)}")


    }
}