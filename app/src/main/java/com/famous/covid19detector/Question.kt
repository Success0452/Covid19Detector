package com.famous.covid19detector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Toast
import com.famous.covid19detector.databinding.ActivityQuestionBinding

class Question : AppCompatActivity(){

    private var select = ""
    private var select2 = ""

    private var selected = ""

    private var yes = ""
    private var no = ""

    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val decide = arrayOf("", "Yes", "No")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, decide)

        //setting adapter on spinner
        binding.spinner.adapter =  arrayAdapter
        binding.spinner2.adapter = arrayAdapter
        binding.spinner3.adapter = arrayAdapter
        binding.spinner4.adapter = arrayAdapter
        binding.spinner5.adapter = arrayAdapter
        binding.spinner6.adapter = arrayAdapter
        binding.spinner7.adapter = arrayAdapter
        binding.spinner8.adapter = arrayAdapter
        binding.spinner9.adapter = arrayAdapter
        binding.spinner10.adapter = arrayAdapter



        binding.spinner.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selected = parent!!.getItemAtPosition(position) as String
                select = when (selected) {
                    "Yes" -> yes
                    "No" -> no
                    else ->  "none"
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
                }

        binding.spinner2.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selected = parent!!.getItemAtPosition(position) as String
               select2 =  when (selected) {
                    "Yes" -> yes
                    "No" -> no
                   else -> "none"
               }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
                }


    }

    private fun Click() {
        val er = select + select2
        val et = select

        when(selected){
            er -> binding.textView.text = "You Have Covid19"
            et -> binding.textView.text = "You Dont Have Covid19"
        }
    }


//    private fun setupSimpleSpinner() {
//           val adapter1 = ArrayAdapter.createFromResource(this,
//                R.array.decide,
//                android.R.layout.simple_spinner_item)
//              adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//        val adapter2 = ArrayAdapter.createFromResource(this,
//                R.array.decide2,
//                android.R.layout.simple_spinner_item)
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//
//
//        binding.spinner.adapter = adapter1
//        binding.spinner2.adapter = adapter2
//
//        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//               var selectedItem = parent!!.getItemAtPosition(position)
//            }
//
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//        }
//
//        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                var selectedItem = parent!!.getItemAtPosition(position)
//            }
//
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//        }
//
//
//    }



}