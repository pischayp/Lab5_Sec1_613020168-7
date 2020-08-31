package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab5intent.R
import com.example.lab5intent.Student
import kotlinx.android.synthetic.main.activity_second.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var data : Bundle? = intent.extras
        var newStudent : Student? = data?.getParcelable( "stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "student Name : ${newStudent?.name}"
        ageText.text = "Student Age : ${newStudent?.age}"
    }
    fun onClickClose(view:View){
        finish()
    }
}