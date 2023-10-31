package com.parasticaret.api.model.shipmentmodels;

import com.parasticaret.api.model.ordermodels.Order;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="shipmentcompany_id")
    private ShipmentCompany shipmentCompany;
    private int cargoTrackingNumber;
    private int cargoTrackingLink;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Shipment(Long id, ShipmentCompany shipmentCompany, int cargoTrackingNumber, int cargoTrackingLink, Order order) {
        this.id = id;
        this.shipmentCompany = shipmentCompany;
        this.cargoTrackingNumber = cargoTrackingNumber;
        this.cargoTrackingLink = cargoTrackingLink;
        this.order = order;
    }

    public Shipment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShipmentCompany getShipmentCompany() {
        return shipmentCompany;
    }

    public void setShipmentCompany(ShipmentCompany shipmentCompany) {
        this.shipmentCompany = shipmentCompany;
    }

    public int getCargoTrackingNumber() {
        return cargoTrackingNumber;
    }

    public void setCargoTrackingNumber(int cargoTrackingNumber) {
        this.cargoTrackingNumber = cargoTrackingNumber;
    }

    public int getCargoTrackingLink() {
        return cargoTrackingLink;
    }

    public void setCargoTrackingLink(int cargoTrackingLink) {
        this.cargoTrackingLink = cargoTrackingLink;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return cargoTrackingNumber == shipment.cargoTrackingNumber && cargoTrackingLink == shipment.cargoTrackingLink
                && Objects.equals(id, shipment.id) && Objects.equals(shipmentCompany, shipment.shipmentCompany)
                && Objects.equals(order, shipment.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shipmentCompany, cargoTrackingNumber, cargoTrackingLink, order);
    }
}
