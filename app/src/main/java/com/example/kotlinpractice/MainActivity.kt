package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.core.view.isVisible
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    lateinit var sheet : FrameLayout
    lateinit var showBTN : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showBTN = findViewById(R.id.showBTN)
        sheet = findViewById(R.id.sheet)

        showBTN.setOnClickListener {
            sheet.visibility = View.VISIBLE
            BottomSheetBehavior.from(sheet).apply {
                peekHeight = 300
                this.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }
}