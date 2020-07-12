package com.example.eStore.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private Long id;

    @Column
    private String name;


    @Column(name = "is_active")
    //order_status -> isActive or not
            boolean isActive;

    @Column(name = "order_date")
    private Instant order_date;

    @ManyToOne
    @Column(name = "account_id")
    private Account account;

    @ManyToOne
    @Column(name = "payment_id")
    private Payment payment;

    @ManyToOne
    @Column(name = "shipping_id")
    private Shipping shipping;

    @ManyToOne
    @Column(name = "product_id")
    private Product product;

}
