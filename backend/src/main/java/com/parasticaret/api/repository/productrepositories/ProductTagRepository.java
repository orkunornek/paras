package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.ProductTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTagRepository extends JpaRepository<ProductTag, Long> {
}
