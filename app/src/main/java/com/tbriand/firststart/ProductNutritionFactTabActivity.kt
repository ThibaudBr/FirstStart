package com.tbriand.firststart

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tbriand.firststart.model.Product
import kotlinx.android.synthetic.main.product_nutrition.*

class ProductNutritionFactTabActivity :  AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_nutrition)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))

        init()
    }

    fun init() {
        val product = Product.product


    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}