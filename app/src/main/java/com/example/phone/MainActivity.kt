package com.example.phone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList: ArrayList<UserData>  // to find the user adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // to store all the images in array form
        val contactProfileImage = intArrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.imgae6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.pic1,
            R.drawable.pic2,
        )

        val contactName = arrayOf(
            "High court",
            "Maa",
            "Shreshtha",
            "John",
            "Harry",
            "Papa",
            "Saloni",
            "Piyush",
            "Poorvi",
            "Shiv",
            "Saheli",
            "Tom"

        )
        val contactNumber = arrayOf(
            "23455667788",
            "23345667788",
            "23455787788",
            "23455667788",
            "23455667008",
            "76548667788",
            "90055667788",
            "2318867788",
            "23454447788",
            "54627728899",
            "82732482748",
            "32746123674"
        )
        userArrayList = ArrayList()
        for (position in contactName.indices) { //position variable hai loop me jisme contact name show hote rahenge jitne hai
            val contact =
                UserData(
                    contactProfileImage[position],
                    contactName[position],
                    contactNumber[position]
                )
            userArrayList.add(contact)
        }
        val listView=findViewById<ListView>(R.id.listView)
        listView.adapter=ContactAdapter(this,userArrayList)
        //list view par different items ko clickable banaya
        listView.isClickable=true
        listView.setOnItemClickListener{
            parent,view,position,id ->
            val profile=contactProfileImage[position]
            val name=contactName[position]
            val number=contactNumber[position]
            val intent= Intent(this,detailContact::class.java)
            intent.putExtra("profileImage",profile)
            intent.putExtra("name",name)
            intent.putExtra("number",number)
            startActivity(intent)

        }
    }
}


      /*  val contactList = listOf(
            contactModel(R.drawable.image1, "High Court"),
            contactModel(R.drawable.image2, "Maa"),
            contactModel(R.drawable.image3, "Shreshtha"),
            contactModel(R.drawable.image4, "Payal"),
            contactModel(R.drawable.image5, "Saurabh"),
            contactModel(R.drawable.imgae6, "Mani"),
            contactModel(R.drawable.image7, "Piyush"),
            contactModel(R.drawable.image8, "Saloni"),
            contactModel(R.drawable.image10, "Poorvi"),


            )
        val contactName: List<String> = contactList.map { it.name }
        val listView: ListView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactName)
        listView.adapter = adapter


    }
}*/

data class contactModel(val image: Int, val name: String)