package com.parasticaret.api.entities.productentities;

import com.parasticaret.api.entities.orderentities.Coupon;
import com.parasticaret.api.entities.orderentities.OrderLine;
import com.parasticaret.api.entities.userentitites.ShoppingCartItem;
import com.parasticaret.api.entities.userentitites.UserFavoriteItem;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="productgroup_id")
    private ProductGroup productGroup;
    private double rate;
    private boolean isActive;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Coupon> coupons;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<UserFavoriteItem> userFavoriteItems;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<ShoppingCartItem> shoppingCartItems;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<OrderLine> orderLines;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Attribute> attributes;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Variant> variants;





}
