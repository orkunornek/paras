package com.parasticaret.api.model.shipmentmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class ShipmentCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int name;

    @OneToMany(mappedBy = "shipmentCompany", fetch = FetchType.LAZY)
    private Set<Shipment> shipments;

    public ShipmentCompany(Long id, int name, Set<Shipment> shipments) {
        this.id = id;
        this.name = name;
        this.shipments = shipments;
    }

    public ShipmentCompany() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Set<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(Set<Shipment> shipments) {
        this.shipments = shipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentCompany that = (ShipmentCompany) o;
        return name == that.name && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
