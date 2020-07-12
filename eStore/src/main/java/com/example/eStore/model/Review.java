package com.example.eStore.model;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    private  Long id;
    @Column
    private String content;
    @Column
    private String status;

    @Column(name = "created_at")
    private Instant created_at;
    @Column(name = "updated_at")
    private Instant updated_at;
    @OneToMany
    private Set<Product> products = new HashSet<>();


}
