package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
