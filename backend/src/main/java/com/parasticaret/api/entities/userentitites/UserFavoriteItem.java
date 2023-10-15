package com.parasticaret.api.entities.userentitites;

import com.parasticaret.api.entities.productentities.Product;
import jakarta.persistence.*;

@Entity
public class UserFavoriteItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="userfavorite_id")
    private UserFavorite userFavorite;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;


}
