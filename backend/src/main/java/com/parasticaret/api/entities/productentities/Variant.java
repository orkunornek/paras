package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

@Entity
public class Variant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="varianttype_id")
    private VariantType variantType;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="productgroup_id")
    private ProductGroup productGroup;
    private String value;
    private int stock;
    private double price;
    private boolean isActive;


}
