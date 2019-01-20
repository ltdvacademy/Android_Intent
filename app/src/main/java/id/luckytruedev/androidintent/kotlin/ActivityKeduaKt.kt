package id.luckytruedev.androidintent.kotlin


import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import id.luckytruedev.androidintent.R

class ActivityKeduaKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)
    }

    override fun onBackPressed() {
        finish()
    }

}