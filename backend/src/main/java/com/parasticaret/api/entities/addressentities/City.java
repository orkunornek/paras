package com.parasticaret.api.entities.addressentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    private Set<District> districts;


}
