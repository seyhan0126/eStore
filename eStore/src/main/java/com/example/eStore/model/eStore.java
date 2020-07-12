package com.example.eStore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estores")
public class eStore {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String email;


    @Column
    private String zipcode;

    @ManyToMany
    @JoinTable(
            name = "estore_addresses",
            joinColumns = @JoinColumn(name = "estore_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private Set<Address> addresses = new HashSet<>();

}
