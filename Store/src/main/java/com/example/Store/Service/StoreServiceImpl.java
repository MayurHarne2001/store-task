package com.example.Store.Service;

import com.example.Store.Entity.Store_Table;
import com.example.Store.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
   private StoreRepository storeRepository;

  public Store_Table createstore(Store_Table store){
       return storeRepository.save(store);
    }
    public Long getStoreIdByName(String name) {
        Store_Table store = storeRepository.findByName(name);
        if (store != null) {
            return store.getStoreId();
        } else {
            throw new IllegalArgumentException("Store with name " + name + " not found.");
        }
    }

}
