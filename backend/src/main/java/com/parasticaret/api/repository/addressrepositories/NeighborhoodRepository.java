package com.parasticaret.api.repository.addressrepositories;

import com.parasticaret.api.model.addressmodels.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {
}
