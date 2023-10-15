package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ProductGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="productgroup_id")
    private ProductGroup productGroup;
    @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
    private Set<Product> products;
    @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
    private Set<Variant> variants;



}
