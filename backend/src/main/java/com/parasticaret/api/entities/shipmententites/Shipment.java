package com.parasticaret.api.entities.shipmententites;

import com.parasticaret.api.entities.orderentities.Order;
import jakarta.persistence.*;

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


}
