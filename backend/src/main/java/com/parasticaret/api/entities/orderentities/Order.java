package com.parasticaret.api.entities.orderentities;

import com.parasticaret.api.entities.addressentities.Address;
import com.parasticaret.api.entities.shipmententites.Shipment;
import com.parasticaret.api.entities.userentitites.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Shipment shipment;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="invoiceadress_id")
    private Address invoiceAddress;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="orderadress_id")
    private Address orderAddress;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="orderstatus_id")
    private OrderStatus orderStatus;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="coupon_id")
    private Coupon coupon;
    private int invoicePaperLink;
    private double grossAmount;
    private double totalAmount;
    private double totalDiscount;
    private LocalDateTime orderTime;
    private String orderNote;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderLine> orderLines;


}
