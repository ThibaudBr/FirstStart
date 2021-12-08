package com.tbriand.firststart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_view, ViewFragment(this))
            .commitAllowingStateLoss()
    }
}