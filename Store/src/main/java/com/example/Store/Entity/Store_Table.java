package com.example.Store.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Store_Table {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long storeId;
    private String name;


}
