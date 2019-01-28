package com.example.ahmedk.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var listItems = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring vars
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

        fab.setOnClickListener { view ->

            //function to add item into listView
            i= i+1
            addListItem()
            Snackbar.make(view, "You just Pressed floating button, event saved in listView", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }


    }

    fun addListItem(){

        //adding items into listView
        listItems.add("Saving Click Event into listView No: " +i )
        adapter?.notifyDataSetChanged()

    }
}
