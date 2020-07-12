package com.example.eStore.model;

import com.example.eStore.model.enums.ShippingType;

import javax.persistence.*;
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
    private Instant ship_date;
    @Column
    private Instant delivery_date;
    @Column
    private Payment payment;
    @Column(name = "shipping_type")
    @Enumerated(EnumType.STRING)
    private ShippingType shippingType = ShippingType.NORMAL;
}
