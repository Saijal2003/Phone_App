package com.example.phone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_contact)
        val userProfile=findViewById<ImageView>(R.id.userprofileImage)
        val userName=findViewById<TextView>(R.id.userName)
        val userContactNumber=findViewById<TextView>(R.id.contactNumber)

        val userprofile=intent.getIntExtra("profileImage",R.drawable.image1) // image is of integer type
        val username=intent.getStringExtra("name")
        val usernumber=intent.getStringExtra("number")

        userProfile.setImageResource(userprofile)
        userName.text=username
        userContactNumber.text=usernumber

    }
}