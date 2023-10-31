package com.parasticaret.api.repository.addressrepositories;

import com.parasticaret.api.model.addressmodels.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
