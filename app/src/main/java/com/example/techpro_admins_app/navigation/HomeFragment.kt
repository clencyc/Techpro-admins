package com.example.techpro_admins_app.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.techpro_admins_app.R
import com.google.android.material.bottomsheet.BottomSheetBehavior

class HomeFragment : Fragment() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomSheetView = view.findViewById<View>(R.id.bottomSheetView) // Replace with your bottom sheet view ID
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetView)

        bottomSheetBehavior.peekHeight = 200

        val button = view.findViewById<ImageButton>(R.id.slideDownButton) // Replace with your button ID
        button.setOnClickListener {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Handle state changes here if needed
                when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        // Bottom sheet is expanded
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        // Bottom sheet is collapsed
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {
                        // Bottom sheet is hidden
                    }
                    // ... other states
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Do something as the bottom sheet slides
            }
        })
    }
}