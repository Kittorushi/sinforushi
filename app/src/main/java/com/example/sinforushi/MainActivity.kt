package com.example.sinforushi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            if (editTextTextPersonName.text.isEmpty()) {
                editTextTextPersonName.error = "Please enter name"
            } else {
                if (radioButton.isChecked) {
                    textView.visibility = View.VISIBLE
                    button2.visibility = View.VISIBLE
                    textView.text = "Welcome Mr.${editTextTextPersonName.text} "
                    button.visibility = View.GONE
                    editTextTextPersonName.visibility = View.GONE
                    radioGroup.visibility = View.GONE
                } else {
                    textView.visibility = View.VISIBLE
                    button2.visibility = View.VISIBLE
                    textView.text = "Welcome Ms.${editTextTextPersonName.text} "
                    button.visibility = View.GONE
                    editTextTextPersonName.visibility = View.GONE
                    radioGroup.visibility = View.GONE
                }

            }
        }

        button2.setOnClickListener {
            button2.visibility = View.GONE
            button.visibility = View.VISIBLE
            editTextTextPersonName.visibility = View.VISIBLE
            radioGroup.visibility = View.VISIBLE
            editTextTextPersonName.setText("")
            textView.visibility = View.GONE
        }

    }
}