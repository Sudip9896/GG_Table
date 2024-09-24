package com.raj.gg_multiplenumber

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.raj.gg_multiplenumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // bind the view
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate the layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        //declare variable  for view to easy to find annd use
        val button = binding.btMUl
        val result = binding.Result
        // when click on button it ftech the edit text value which input
        // if not  show else  toast
        //call muliply function
        button.setOnClickListener {
            val editText = binding.ETvalueInput.text.toString()
            if (editText.isNotEmpty()) {
                val value = editText.toInt()
                result.text = do_mulplication(value)
            }
            else
            {
                Toast.makeText(this,"Enter the value ",Toast.LENGTH_SHORT).show()
            }
        }
        setContentView(binding.root)
    }

        // function for table
    fun do_mulplication(value: Int?): String {
        var result = ""

        for (i in 1..10) {
            result += "$value * $i = ${value!! * i}\n "
        }
        Log.e("result", " $result ")
        return result
    }
}
