package com.agnes.edukeri_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.agnes.edukeri_mobile_app.databinding.ActivityCoursesBinding

class CoursesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoursesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            startActivity(Intent(this, FoundationActivity::class.java))
        }
    }
}
