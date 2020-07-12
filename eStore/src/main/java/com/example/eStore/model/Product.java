package com.example.eStore.model;

import com.example.eStore.model.enums.ProductType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @ManyToOne
    @Column(name = "category_id")
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "product_estores",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "estore_id")
    )
    private Set<eStore> estores = new HashSet<>();


}
