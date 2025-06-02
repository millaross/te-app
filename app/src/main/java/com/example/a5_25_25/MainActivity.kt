package com.example.a5_25_25

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonToCheckRingStudy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Make sure your layout file is named 'activity_main.xml' (or adjust accordingly)
        setContentView(R.layout.layout)

        // ✅ Make sure this ID exists in your activity_main.xml
        buttonToCheckRingStudy = findViewById(R.id.checkringstudy)

        // ✅ Make sure you have declared CheckRingStudyActivity in AndroidManifest.xml
        buttonToCheckRingStudy.setOnClickListener {
            val intent = Intent(this, CheckRingStudyActivity::class.java)
            startActivity(intent)
        }
    }
}
