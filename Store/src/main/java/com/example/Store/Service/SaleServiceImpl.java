package com.example.Store.Service;

import com.example.Store.Entity.Product_Table;
import com.example.Store.Entity.Sale_Table;
import com.example.Store.Entity.Store_Table;
import com.example.Store.Repository.ProductRepository;
import com.example.Store.Repository.SaleRepository;
import com.example.Store.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService{


    @Autowired
    SaleRepository saleRepository;

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ProductRepository productRepository;
    @Override
    public Sale_Table createsale(Sale_Table sale) {
        Store_Table store = storeRepository.findById(sale.getStore().getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid Store ID"));
        Product_Table product = productRepository.findById(sale.getProduct().getProductId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid Product ID"));

       sale.setStore(store);
        sale.setProduct(product);

        return saleRepository.save(sale);

    }
}
