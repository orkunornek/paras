package com.parasticaret.api.entities.productentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AttributeType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "attributeType", fetch = FetchType.LAZY)
    private Set<Attribute> attributes;


}
