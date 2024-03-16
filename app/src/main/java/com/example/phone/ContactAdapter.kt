package com.example.phone

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ContactAdapter(private val context: Activity, private val arrayList: ArrayList<UserData> ):
    ArrayAdapter<UserData>(context,R.layout.contact_item,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view:View =convertView?:LayoutInflater.from(context).inflate(R.layout.contact_item,parent,false) // contact item layout ko find kiya hai and usko view me convert kiya hai

        val image: ImageView =view.findViewById(R.id.contactImage)
        val name: TextView= view.findViewById(R.id.contactName)


        //to get the position of image and name
        image.setImageResource(arrayList[position].ContactProfile)
        name.text=arrayList[position].ContactName

        return view

        return super.getView(position, convertView, parent)
    }

}