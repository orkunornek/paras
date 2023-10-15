package com.parasticaret.api.entities.userentitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "shoppingCart", fetch = FetchType.LAZY)
    private Set<ShoppingCartItem> shoppingCartItems;


}
