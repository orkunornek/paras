package com.parasticaret.api.repository.productrepositories;

import com.parasticaret.api.model.productmodels.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepository extends JpaRepository<Attribute, Long> {
}
