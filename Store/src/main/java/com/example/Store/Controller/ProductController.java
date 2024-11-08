package com.example.Store.Controller;

import com.example.Store.Entity.Product_Table;
import com.example.Store.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

   @Autowired
   private ProductService productService;
    @PostMapping("/addproduct")
        public ResponseEntity<Product_Table>createProduct(@RequestBody Product_Table product){
            return new ResponseEntity<>(productService.createproduct(product), HttpStatus.CREATED);


        }

        @GetMapping("/allproduct")
        public ResponseEntity<List<Product_Table>>getallproduct(){
        return new ResponseEntity<>(productService.getallProducts(),HttpStatus.FOUND);
       }
    }
