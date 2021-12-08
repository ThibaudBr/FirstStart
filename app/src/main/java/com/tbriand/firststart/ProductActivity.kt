package com.tbriand.firststart

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso
import com.tbriand.firststart.model.NutritionFacts
import com.tbriand.firststart.model.NutritionFactsItem
import com.tbriand.firststart.model.Product
import kotlinx.android.synthetic.main.product_details.*

class ProductActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))

        init()
    }

    private fun init(){
        val product = Product.product
        Picasso.get().load(product.picture).into(picture)
        initNutriscore(product)
        name.text = product.name
        brand.text = product.brand
        barCode.text = "Code barres : " + product.barCode
        quantity.text = "Quantité : " + product.quantity
        countryList.text = "Vendu en : " + product.countryListToString
        ingredientList.text = "Ingrédients : " + product.ingredientListToString
        allergenicSubstancesList.text = "Substances allergènes : " + product.allergenicSubstancesListToString
        additivesList.text = "Additifs : " + product.additivesListToString
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    private fun initNutriscore(product: Product) {
        when (product.nutritiveScore) {
            "A" -> nutritiveScore.setBackgroundResource(R.drawable.nutriscore_a)
            "B" -> nutritiveScore.setBackgroundResource(R.drawable.nutriscore_b)
            "C" -> nutritiveScore.setBackgroundResource(R.drawable.nutriscore_c)
            "D" -> nutritiveScore.setBackgroundResource(R.drawable.nutriscore_d)
            "E" -> nutritiveScore.setBackgroundResource(R.drawable.nutriscore_e)
            else -> {
                print("nutriscore unknown")
            }
        }
    }
}