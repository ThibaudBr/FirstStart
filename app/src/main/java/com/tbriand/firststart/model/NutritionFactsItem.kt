package com.tbriand.firststart.model

class NutritionFactsItem(
    var unit: String,
    var quantityByServing: Float,
    var quantityByGramme: Float
){
    val toStringByGramme: String
    get() {
        if (unit.isEmpty()){
            return " Pas d'informations"
        }

        return "$quantityByGramme $unit"
    }

    val toStringByServing: String
        get() {
            if (unit.isEmpty()){
                return " Pas d'informations"
            }

            return "$quantityByServing $unit"
        }
}