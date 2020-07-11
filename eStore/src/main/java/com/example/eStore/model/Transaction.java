package com.example.eStore.model;

import com.example.eStore.enums.TransactionType;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Account sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Account receiver;
    @Column
    private  String description;
    @Column(name = "date_created")
    private Instant dateCreated;
    @Column(name = "date_completed")
    private Instant dateCompleted;
    @Column(name = "date_updated")
    private  Instant dateUpdated;
    @Column
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType = TransactionType.NEW;
    @Column
    private Long amount;

}
