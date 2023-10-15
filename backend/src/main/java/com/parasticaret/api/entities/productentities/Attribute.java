package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="attributetype_id")
    private AttributeType attributeType;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private String value;


}
