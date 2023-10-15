package com.parasticaret.api.entities.shipmententites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ShipmentCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int name;

    @OneToMany(mappedBy = "shipmentCompany", fetch = FetchType.LAZY)
    private Set<Shipment> shipments;
}
