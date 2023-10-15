package com.parasticaret.api.entities.addressentities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Neighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="district_id")
    private District district;
    private String name;
    private int postalCode;

    @OneToMany(mappedBy = "neighborhood", fetch = FetchType.LAZY)
    private Set<Address> addresses;
}
