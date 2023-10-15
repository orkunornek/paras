package com.parasticaret.api.entities.userentitites;

import com.parasticaret.api.entities.productentities.Product;
import jakarta.persistence.*;

@Entity
public class ShoppingCartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="shoppingcart_id")
    private ShoppingCart shoppingCart;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private int quantity;


}
