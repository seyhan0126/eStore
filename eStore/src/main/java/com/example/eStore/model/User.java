package com.example.eStore.model;

import com.example.eStore.enums.UserType;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phoneNumber;
    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @OneToMany
    private Set<Account> accounts = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "users_addresses",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")

    )
    private Set<Address> addresses = new HashSet<>();
    @Column
    private Instant created_at;
    @Column
    private Instant updated_at;
}
