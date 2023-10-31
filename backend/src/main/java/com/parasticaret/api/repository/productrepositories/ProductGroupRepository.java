package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
}
