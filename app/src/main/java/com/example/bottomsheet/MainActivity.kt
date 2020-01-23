package com.example.bottomsheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var behavior: BottomSheetBehavior<View>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        behavior = BottomSheetBehavior.from(scroll)

        expand.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        collapse.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        next.setOnClickListener {
            startActivity(Intent(this,SheetFragActivity::class.java))
        }
    }
}
