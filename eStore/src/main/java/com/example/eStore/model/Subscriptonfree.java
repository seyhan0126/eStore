package com.example.eStore.model;

import javax.persistence.*;

@Entity
@Table(name = "subscriptionfrees")
public class Subscriptonfree {
    @Id
    private Long id;
    @Column
    private String name;
    @OneToMany
    private Address address;
    @OneToMany
    private Payment payment;
    @OneToMany
    private Product product;
    @OneToMany
    private Order order;

}
