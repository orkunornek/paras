package com.parasticaret.api.entities.addressentities;

import com.parasticaret.api.entities.orderentities.Order;
import com.parasticaret.api.entities.userentitites.User;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="neighborhood_id")
    private Neighborhood neighborhood;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String addressTitle;
    private String addressDescription;
    private boolean invoiceType;
    private String taxIdentificationNumber;
    private String taxAdministration;
    private String companyName;
    private boolean isActive;
    @OneToMany(mappedBy = "orderAddress", fetch = FetchType.LAZY)
    private Set<Order> asOrderAddress;
    @OneToMany(mappedBy = "invoiceAddress", fetch = FetchType.LAZY)
    private Set<Order> asInvoiceAddress;
}
