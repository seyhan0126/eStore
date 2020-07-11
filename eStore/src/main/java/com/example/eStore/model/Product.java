package com.example.eStore.model;

import com.example.eStore.enums.ProductType;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String price;
    @Column
    @Enumerated(EnumType.STRING)
    private ProductType productType =  ProductType.ALL;

}
