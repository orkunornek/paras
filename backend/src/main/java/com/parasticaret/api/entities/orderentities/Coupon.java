package com.parasticaret.api.entities.orderentities;

import com.parasticaret.api.entities.productentities.Category;
import com.parasticaret.api.entities.productentities.Product;
import com.parasticaret.api.entities.userentitites.UserCoupon;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private double discountAmount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private double cartLowerAmount;

    @OneToMany(mappedBy = "coupon", fetch = FetchType.LAZY)
    private Set<Order> orders;
    @OneToMany(mappedBy = "coupon", fetch = FetchType.LAZY)
    private Set<UserCoupon> userCoupons;


}
