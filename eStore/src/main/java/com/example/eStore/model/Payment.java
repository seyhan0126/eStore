package com.example.eStore.model;

import com.example.eStore.model.enums.PaymentType;


import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private Long id;

    @Column
    private String amount;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType =  PaymentType.CASH;

    @Column
    private String state;

}
