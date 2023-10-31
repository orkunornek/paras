package com.parasticaret.api.repository.addressrepositories;

import com.parasticaret.api.model.addressmodels.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District, Long> {
}
