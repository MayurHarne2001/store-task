package com.example.Store.Repository;

import com.example.Store.Entity.Product_Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product_Table,Long> {
}
