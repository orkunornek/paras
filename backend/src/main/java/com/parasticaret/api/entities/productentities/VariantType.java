package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class VariantType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int displayType;

    @OneToMany(mappedBy = "variantType", fetch = FetchType.LAZY)
    private Set<Variant> variants;

}
