package id.luckytruedev.androidintent.kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

import id.luckytruedev.androidintent.R

class MainActivityKotlin : AppCompatActivity() {

    internal lateinit var explicit_btn: Button
    internal lateinit var implicit_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        explicit_btn = findViewById(R.id.btnExplisit) as Button
        implicit_btn = findViewById(R.id.btnImplisit) as Button

        explicit_btn.setOnClickListener {
            val intent = Intent(baseContext, ActivityKeduaKt::class.java)
            startActivity(intent)
        }
        implicit_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://www.luckytruedev.com")
            startActivity(intent)
        }
    }
}
