package com.example.Store.Controller;


import com.example.Store.Entity.Sale_Table;
import com.example.Store.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaleController {

   @Autowired
    private SaleService saleService;

   @PostMapping("/addsales")
    public ResponseEntity<Sale_Table> addsale(@RequestBody Sale_Table sale){
        return new ResponseEntity<>(saleService.createsale(sale), HttpStatus.CREATED);
   }
}
