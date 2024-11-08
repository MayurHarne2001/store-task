package com.example.Store.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dto {

    private String product_name;
    private Long sale;
    private Long mrp;
    private double amount;
}
