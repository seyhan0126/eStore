package com.example.eStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private Long id;

    @Column
    private String name;

    @Column(name = "order_date")
    private Instant order_date;

    @Column
    //order_status -> isActive or not
    boolean isActive;
}
