package com.mmd.shimmerex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shimmerLayout = findViewById<ShimmerFrameLayout>(R.id.shimmer_layout)
        shimmerLayout.startShimmer()
    }
}