package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sheet_frag.*

class SheetFragActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sheet_frag)

        showBottom.setOnClickListener {
            BottomSheetFrag().show(supportFragmentManager,"bottomSheet")
        }
    }
}
