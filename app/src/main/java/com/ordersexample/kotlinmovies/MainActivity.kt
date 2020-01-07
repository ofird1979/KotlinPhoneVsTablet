package com.ordersexample.kotlinmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var leftFrame:FrameLayout
    private lateinit var rightFrame:FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val isTablet:Boolean=resources.getBoolean(R.bool.isTablet)
        (
            if (isTablet) {
                val lFrag = LeftMainFragment()
                val rFrag = RightMainFragment()

                leftFrame = findViewById(R.id.left_main_container)
                rightFrame = findViewById(R.id.right_main_container)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.left_main_container, lFrag)
                    .add(R.id.right_main_container,rFrag)
                    .commit()
            } else {
                val lFrag = LeftMainFragment()
                leftFrame = findViewById(R.id.left_main_container)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.left_main_container, lFrag)
                    .commit()
            }
        )

    }
}
