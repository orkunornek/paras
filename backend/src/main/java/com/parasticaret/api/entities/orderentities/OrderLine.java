package com.parasticaret.api.entities.orderentities;

import com.parasticaret.api.entities.productentities.Product;
import com.parasticaret.api.entities.userentitites.UserReview;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private int quantity;
    private double totalAmount;
    private double lineAmount;

    @OneToMany(mappedBy = "orderLine", fetch = FetchType.LAZY)
    private Set<UserReview> userReviews;


}
