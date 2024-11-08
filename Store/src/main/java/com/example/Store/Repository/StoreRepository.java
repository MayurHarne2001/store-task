package com.example.Store.Repository;

import com.example.Store.Entity.Store_Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository< Store_Table,Long> {
    Store_Table findByName(String name);
}
