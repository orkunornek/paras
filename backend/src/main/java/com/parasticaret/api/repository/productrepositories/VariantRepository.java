package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantRepository extends JpaRepository<Variant, Long> {
}
