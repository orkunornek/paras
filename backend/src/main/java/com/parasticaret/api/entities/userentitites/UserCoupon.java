package com.parasticaret.api.entities.userentitites;

import com.parasticaret.api.entities.orderentities.Coupon;
import jakarta.persistence.*;

@Entity
public class UserCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="coupon_id")
    private Coupon coupon;
    private boolean isActive;


}
