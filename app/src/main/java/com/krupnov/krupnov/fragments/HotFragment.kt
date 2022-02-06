package com.krupnov.krupnov.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.krupnov.krupnov.R


class HotFragment : ParentFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_hot, container, false)
        initializeGlobalConstants(view)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 40f
        circularProgressDrawable.setColorSchemeColors(Color.BLACK)
        circularProgressDrawable.start()
        val buttonBack: ImageButton = view.findViewById(R.id.buttonBack3) as ImageButton
        buttonBack.setOnClickListener { back() }
        val buttonNext: ImageButton = view.findViewById(R.id.buttonNext3) as ImageButton
        buttonNext.setOnClickListener { nextGif() }
        currGif()
        return view
    }

    private fun initializeGlobalConstants(view: View) {
        category = "hot"
        mImageView = view.findViewById(R.id.gifImageView3)
        mTextView = view.findViewById(R.id.caption3)
        circularProgressDrawable = CircularProgressDrawable(mImageView.context)
    }
}