package com.example.Store.Service;


import com.example.Store.Entity.Store_Table;

public interface StoreService {
    Store_Table createstore (Store_Table store);
    Long getStoreIdByName(String name);
}

