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

    private lateinit var select : String
    private lateinit var select2 : String
    private lateinit var select3 : String
    private lateinit var select4 : String
    private lateinit var select5 : String
    private lateinit var select6 : String
    private lateinit var select7 : String
    private lateinit var select8 : String
    private lateinit var select9 : String
    private lateinit var select10 : String
    private lateinit var select11 : String


    private lateinit var selected :String

    private lateinit var yes : String
    private lateinit var no : String

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
        binding.spinner11.adapter = arrayAdapter

        binding.spinner.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                 select = parent!!.getItemAtPosition(position) as String
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
                }

        binding.spinner2.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select2 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
                }

        binding.spinner3.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select3 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner4.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select4 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner5.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select5 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner6.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select6 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner7.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select7 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner8.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select8 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner9.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select9 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner10.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select10 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        binding.spinner11.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                select11 = parent!!.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



// Initialize the process Button

        binding.processBtn.setOnClickListener{
            if(select == select4 && select4 == select9){
                binding.result.text = "Covid19 Alert, Call 119"
            }  else {
                binding.result.text = "You Have Maleria \n Go Visit a Doctor"
            }
        }


    }

    private fun Click() {
    }

}