package com.tbriand.firststart.model

class Product(
    var name: String,
    var brand: String,
    var barCode: String,
    var nutritiveScore: String,
    var picture: String,
    var quantity: String,
    var countryList: List<String>,
    var ingredientList: List<String>,
    var allergenicSubstancesList: List<String>,
    var additivesList: List<String>,
    var nutritionFacts: NutritionFacts
){
    val countryListToString: String
        get() {
            if (countryList.isEmpty()){
                return " Pas d'informations"
            }
            var countrys = ""
            for (country in countryList){
                countrys += ", $country"
            }
            return countrys
        }

    val ingredientListToString: String
        get() {
            if (ingredientList.isEmpty()){
                return " Pas d'informations"
            }
            var ingredients = ""
            for (ingredient in ingredientList){
                ingredients += ", $ingredient"
            }
            return ingredients
        }

    val allergenicSubstancesListToString: String
        get() {
            if (allergenicSubstancesList.isEmpty()){
                return " Pas d'informations"
            }
            var allergenicSubstances = ""
            for (allergenicSubstance in allergenicSubstancesList){
                allergenicSubstances += ", $allergenicSubstance"
            }
            return allergenicSubstances
        }

    val additivesListToString: String
        get() {
            if (additivesList.isEmpty()){
                return " Pas d'informations"
            }
            var additives = ""
            for (additive in additivesList){
                additives += ", $additive"
            }
            return additives
        }
    companion object {
        val product: Product = Product("Petits pois et carottes",
            "Cassegrain",
            "3083680085304",
            "A",
            "https://static.openfoodfacts.org/images/products/308/368/008/5304/front_fr.7.400.jpg",
            "400 g (280 g net égoutté)",
            listOf("France", "Japon", "Suisse"),
            listOf("Petits pois 66%", "eau", "garniture 2,8% (salade, oignon grelot)", "sucre", "sel", "arôme naturel"),
            listOf(),
            listOf(),
            NutritionFacts(
                NutritionFactsItem("kj", 293.0F, 293.0F),
                NutritionFactsItem("g", 0.8F, 0.8F),
                NutritionFactsItem("g", 0.1F, 0.1F),
                NutritionFactsItem("g", 8.4F, 8.4F),
                NutritionFactsItem("g", 5.2F, 5.2F),
                NutritionFactsItem("g", 5.2F, 5.2F),
                NutritionFactsItem("g", 4.8F, 4.8F),
                NutritionFactsItem("g", 0.75F, 0.75F),
                NutritionFactsItem("g", 0.295F, 0.295F),
            )
        )
    }
}