package com.parasticaret.api.entities.productentities;

import com.parasticaret.api.entities.orderentities.Coupon;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Coupon> coupons;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<SubCategory> subCategories;

}
