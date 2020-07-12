package com.example.eStore.model;

import com.example.eStore.model.enums.AccountType;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    private Long id;

    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType = AccountType.PUBLIC;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
