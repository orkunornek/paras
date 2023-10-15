package com.parasticaret.api.entities.addressentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;
    private String name;

    @OneToMany(mappedBy = "district", fetch = FetchType.LAZY)
    private Set<Neighborhood> neighborhoods;


}
