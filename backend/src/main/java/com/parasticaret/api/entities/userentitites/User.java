package com.parasticaret.api.entities.userentitites;

import com.parasticaret.api.entities.addressentities.Address;
import com.parasticaret.api.entities.orderentities.Order;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDateTime birthday;
    private int gender;
    private boolean isActive;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Order> orders;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Address> addresses;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<UserReview> userReviewS;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<UserCoupon> userCoupons;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private UserFavorite userFavorite;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ShoppingCart shoppingCart;

}
