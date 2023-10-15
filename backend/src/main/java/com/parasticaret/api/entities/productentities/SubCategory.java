package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;
    private String name;

    @OneToMany(mappedBy = "subCategory", fetch = FetchType.LAZY)
    private Set<ProductTag> productTags;


}
