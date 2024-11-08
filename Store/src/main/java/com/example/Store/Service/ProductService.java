package com.example.Store.Service;

import com.example.Store.Entity.Product_Table;

import java.util.List;

public interface ProductService {
    Product_Table createproduct(Product_Table product);

   List<Product_Table> getallProducts();
}
