package com.example.Store.Service;

import com.example.Store.Dto.Dto;
import com.example.Store.Entity.Product_Table;
import com.example.Store.Entity.Sale_Table;
import com.example.Store.Entity.Store_Table;
import com.example.Store.Repository.ProductRepository;
import com.example.Store.Repository.SaleRepository;
import com.example.Store.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private StoreRepository storeRepository;

    public List<Dto> getoutput(String name) {
        List<Dto> list = new ArrayList<>();
        Store_Table store = storeRepository.findByName(name);
        List<Product_Table> products = productRepository.findAll();
        List<Sale_Table> sales = saleRepository.findByStore(store);
        for (Product_Table product : products) {
            Long quantity = 0L;
            boolean flag = false;
            for (Sale_Table sale : sales) {
                if (product.getProductId().equals(sale.getProduct().getProductId())) {
                    quantity += sale.getSale_quantity();
                    flag = true;
                }
            }
            if (flag) {
                Dto dto = new Dto();
                dto.setProduct_name(product.getName());
                dto.setSale(quantity);
                dto.setMrp(product.getMrp());
                dto.setAmount(quantity * product.getMrp());
                list.add(dto);
            }
        }
        return list;
    }
}
