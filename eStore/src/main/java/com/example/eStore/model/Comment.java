package com.example.eStore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    private Long id;

    @Column
    private String comment;

   @Column
   private String answer;

   @ManyToMany
   @JoinTable(
            name = "comment_accounts",
            joinColumns = @JoinColumn(name = "comment_id"),
            inverseJoinColumns = @JoinColumn(name = "account_id")
    )
   private Set<Account> accounts = new HashSet<>();

   @ManyToOne(cascade = {CascadeType.ALL})
   @JoinColumn(name = "product_id")
   private Set<Product> products = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
