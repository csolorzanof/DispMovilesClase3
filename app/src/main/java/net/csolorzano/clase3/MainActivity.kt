package net.csolorzano.clase3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Actividad onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Actividad onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Actividad onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Actividad onResume")
    }

    companion object{
        public const val TAG = "DispMov"
    }
}