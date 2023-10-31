package com.parasticaret.api.repository.shipmentrepositories;

import com.parasticaret.api.model.shipmentmodels.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
