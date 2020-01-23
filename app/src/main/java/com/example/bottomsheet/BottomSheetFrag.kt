package com.example.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.frag_sheet.view.*

class BottomSheetFrag(): BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.frag_sheet, container, false)

        view.button.setOnClickListener { Toast.makeText(activity,"dqwdqq",Toast.LENGTH_SHORT).show() }

        return view
    }
}