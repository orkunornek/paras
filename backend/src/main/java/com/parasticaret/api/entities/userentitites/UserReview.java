package com.parasticaret.api.entities.userentitites;

import com.parasticaret.api.entities.orderentities.OrderLine;
import jakarta.persistence.*;

@Entity
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="orderline_id")
    private OrderLine orderLine;
    private double rate;
    private String comment;


}
