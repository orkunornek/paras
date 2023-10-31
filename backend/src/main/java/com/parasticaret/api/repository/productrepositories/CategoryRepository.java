package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
