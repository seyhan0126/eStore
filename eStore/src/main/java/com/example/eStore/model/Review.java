package com.example.eStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

    private Set<User> users = new HashSet<>();
}
