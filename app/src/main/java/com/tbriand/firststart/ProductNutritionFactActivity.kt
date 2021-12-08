package com.tbriand.firststart

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tbriand.firststart.model.NutritionFacts
import com.tbriand.firststart.model.NutritionFactsItem
import com.tbriand.firststart.model.Product
import kotlinx.android.synthetic.main.product_nutrition.*

class ProductNutritionFactActivity :  AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_nutrition)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))

        init()
    }

    fun init(){
        val product = Product.product

        fat.text = colorFatByGramme(product.nutritionFacts.fat)
        saturatedFattyAcids.text = colorSaturatedFattyAcidsByGramme(product.nutritionFacts.saturatedFattyAcids)
        sugar.text = colorSugarByGramme(product.nutritionFacts.sugar)
        salt.text = colorSaltByGramme(product.nutritionFacts.salt)

    }

    private fun colorSaltByGramme(salt: NutritionFactsItem): String {
        if (salt.quantityByGramme <= 0.3f) {
            color_salt.setColorFilter(resources.getColor(R.color.nutrient_level_low))
            return salt.toStringByGramme + " de sel en faible quantité"
        } else if (salt.quantityByGramme > 0.3f && salt.quantityByGramme <= 1.5f) {
            color_salt.setColorFilter(resources.getColor(R.color.nutrient_level_moderate))
            return salt.toStringByGramme + " de sel en quantité modéré"
        } else if (salt.quantityByGramme > 1.5f) {
            color_salt.setColorFilter(resources.getColor(R.color.nutrient_level_high))
            return salt.toStringByGramme + " de sel en quantité modéré"
        }
        return "pas d'informations"
    }

    private fun colorSugarByGramme(sugar: NutritionFactsItem): String {
        if (sugar.quantityByGramme <= 5.0f) {
            color_sugar.setColorFilter(resources.getColor(R.color.nutrient_level_low))
            return sugar.toStringByGramme + " de sucre en faible quantité"
        } else if (sugar.quantityByGramme > 5.0f && sugar.quantityByGramme <= 12.5f) {
            color_sugar.setColorFilter(resources.getColor(R.color.nutrient_level_moderate))
            return sugar.toStringByGramme + " desucre en quantité modéré"
        } else if (sugar.quantityByGramme > 12.5f) {
            color_sugar.setColorFilter(resources.getColor(R.color.nutrient_level_high))
            return sugar.toStringByGramme + " de sucre en quantité élevé"
        }
        return "pas d'informations"
    }

    private fun colorSaturatedFattyAcidsByGramme(saturatedFattyAcids: NutritionFactsItem): String {
        if (saturatedFattyAcids.quantityByGramme <= 1.5f) {
            color_saturatedFattyAcids.setColorFilter(resources.getColor(R.color.nutrient_level_low))
            return saturatedFattyAcids.toStringByGramme + " d'acides gras saturé en faible quantité"
        } else if (saturatedFattyAcids.quantityByGramme > 1.5f && saturatedFattyAcids.quantityByGramme <= 5.0f) {
            color_saturatedFattyAcids.setColorFilter(resources.getColor(R.color.nutrient_level_moderate))
            return saturatedFattyAcids.toStringByGramme + " d'acides gras saturé en quantité modéré"
        } else if (saturatedFattyAcids.quantityByGramme > 5.0f) {
            color_saturatedFattyAcids.setColorFilter(resources.getColor(R.color.nutrient_level_high))
            return saturatedFattyAcids.toStringByGramme + " d'acides gras saturé en quantité élevé"
        }
        return "pas d'informations"
    }

    fun colorFatByGramme(fat: NutritionFactsItem): String{
        if (fat.quantityByGramme <= 3.0f) {
            color_fat.setColorFilter(resources.getColor(R.color.nutrient_level_low))
            return fat.toStringByGramme + " de Matière grasses / lipides en faible quantité"
        } else if (fat.quantityByGramme > 3 && fat.quantityByGramme <= 20.0f) {
            color_fat.setColorFilter(resources.getColor(R.color.nutrient_level_moderate))
            return fat.toStringByGramme + " de Matière grasses / lipides en quantité modéré"
        } else if (fat.quantityByGramme > 20.0f) {
            color_fat.setColorFilter(resources.getColor(R.color.nutrient_level_high))
            return fat.toStringByGramme + " de Matière grasses / lipides en quantité élevé"
        }
        return "pas d'informations"
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}