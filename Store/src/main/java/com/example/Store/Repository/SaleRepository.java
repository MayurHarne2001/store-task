package com.example.Store.Repository;

import com.example.Store.Entity.Sale_Table;
import com.example.Store.Entity.Store_Table;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale_Table,Long> {
    List<Sale_Table> findByStore(Store_Table sId);
}
