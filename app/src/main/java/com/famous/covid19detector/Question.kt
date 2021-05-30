package com.famous.covid19detector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.famous.covid19detector.databinding.ActivityQuestionBinding

class Question : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.setOnClickListener(this)
        binding.checkBox2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked
        when(v.id){
            R.id.checkBox -> if (isChecked){
                binding.textView.text = "Male"
                binding.checkBox2.isChecked = false
            }
            R.id.checkBox2 -> if (isChecked){
                binding.textView.text = "Female"
                binding.checkBox.isChecked = false
            }
        }
    }
}