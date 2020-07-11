package com.example.eStore.model;

import com.example.eStore.enums.AccountType;
import com.example.eStore.enums.PaymentType;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private Long id;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType =  PaymentType.CASH;
}
