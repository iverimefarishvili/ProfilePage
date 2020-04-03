package com.example.profilepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.startpage.*
import kotlinx.android.synthetic.main.startpage.change_button
import kotlinx.android.synthetic.main.startpage.email
import kotlinx.android.synthetic.main.startpage.gender
import kotlinx.android.synthetic.main.startpage.name
import kotlinx.android.synthetic.main.startpage.surname

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage)
        onClick();
    }

    private fun onClick() {
        change_button.setOnClickListener {
            val intent = Intent(this, ChangeActivity::class.java)
            startActivity(intent)
        }

        val intent = intent
        val dataModel = intent.getParcelableExtra("data") as? DataModel
        name.text = dataModel?.name.toString()
        Log.d("sdas",dataModel?.name.toString())
        surname.text = dataModel?.surname.toString()
        email.text = dataModel?.email.toString()
        age.text = dataModel?.age.toString()
        gender.text = dataModel?.gender.toString()
    }
}
