package com.example.eStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "shippings")
public class Shipping {
    @Id
    private Long id;
    @Column
    private String shipping_method;
    @Column
    private String state;
    @Column
    private Instant delivery_date;
    @Column
    private Payment payment;
}
