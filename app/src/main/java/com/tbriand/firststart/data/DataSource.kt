package com.tbriand.firststart.data

import com.tbriand.firststart.model.Product

class DataSource {
    fun loadFakeProduct() : List<Product>{
        return listOf<Product>(
            Product.product,
            Product.product,
            Product.product,
            Product.product,
            Product.product
        )

    }
}