package com.dh.livetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dh.livetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var list = intArrayOf(
                binding.txtAngka1.text.toString().toInt(),
                binding.txtAngka2.text.toString().toInt(),
                binding.txtAngka3.text.toString().toInt(),
                binding.txtAngka4.text.toString().toInt(),
                binding.txtAngka5.text.toString().toInt()
            )

            val sorted = list.sorted()

            var maxValue = list.max()

            binding.show.text = maxValue.toString()
            binding.sorted.text = sorted.toString()
        }

    }
}