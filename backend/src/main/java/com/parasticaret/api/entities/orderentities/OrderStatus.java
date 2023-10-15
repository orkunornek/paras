package com.parasticaret.api.entities.orderentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean status;

    @OneToMany(mappedBy = "orderStatus", fetch = FetchType.LAZY)
    private Set<Order> orders;

}
