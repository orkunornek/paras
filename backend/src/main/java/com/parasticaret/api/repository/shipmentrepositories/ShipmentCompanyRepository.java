package com.parasticaret.api.repository.shipmentrepositories;

import com.parasticaret.api.model.shipmentmodels.ShipmentCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentCompanyRepository extends JpaRepository<ShipmentCompany, Long> {
}
