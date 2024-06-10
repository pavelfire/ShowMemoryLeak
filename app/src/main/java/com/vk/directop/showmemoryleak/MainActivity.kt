package com.vk.directop.showmemoryleak

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)

        val intent = Intent(this, SecondActivity::class.java).also { }

        button.setOnClickListener{
            startActivity(intent)
        }
        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        Log.d(TAG, "list: $context")
        super.onResume()
    }

    override fun onStateNotSaved() {
        Log.d(TAG, "onStateNotSaved")
        super.onStateNotSaved()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    companion object{
        private const val TAG = "MainActivity"

        var context: MutableList<Context> = mutableListOf()
    }
}