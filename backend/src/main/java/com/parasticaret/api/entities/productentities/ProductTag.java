package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ProductTag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="subcategory_id")
    private SubCategory subCategory;

    private String name;

    @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
    private Set<ProductGroup> productGroups;


}
