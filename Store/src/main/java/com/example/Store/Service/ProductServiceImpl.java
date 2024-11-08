package com.example.Store.Service;

import com.example.Store.Entity.Product_Table;
import com.example.Store.Repository.ProductRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product_Table createproduct(Product_Table product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product_Table> getallProducts() {
        return productRepository.findAll();
    }
}
