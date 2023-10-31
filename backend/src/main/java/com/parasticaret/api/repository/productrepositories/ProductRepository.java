package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
