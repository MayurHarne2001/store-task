package com.example.Store.Controller;


import com.example.Store.Entity.Store_Table;
import com.example.Store.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StoreController {
    @Autowired
   private StoreService storeService;

    @PostMapping("/addstore")
    public ResponseEntity<Store_Table>createStore(@RequestBody Store_Table store){
        return ResponseEntity.status(HttpStatus.CREATED).body(storeService.createstore(store));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Long>createStore(@PathVariable String name){
        return new ResponseEntity<>(storeService.getStoreIdByName(name), HttpStatus.OK);
    }

}