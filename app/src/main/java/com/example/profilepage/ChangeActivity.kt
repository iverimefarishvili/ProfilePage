package com.example.profilepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class ChangeActivity : AppCompatActivity() {

    private val requestCode = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClick()
    }

    private fun onClick() {
        change.setOnClickListener {
           saveData()
        }
    }

    private fun saveData() {
        val data = DataModel(
            name.text.toString(),
            surname.text.toString(),
            email.text.toString(),
            birth.text.toString().toInt(),
            gender.text.toString()
        )
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("data", data)
        startActivityForResult(intent, requestCode)
    }
}
