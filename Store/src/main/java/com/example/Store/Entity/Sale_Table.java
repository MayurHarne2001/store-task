package com.example.Store.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sale_Table {
    @Id
    private  Long Id;

    private Long sale_quantity;

    @ManyToOne
    @JoinColumn(name = "storeId", referencedColumnName = "storeId")
    private Store_Table store;

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    private Product_Table product;
}
