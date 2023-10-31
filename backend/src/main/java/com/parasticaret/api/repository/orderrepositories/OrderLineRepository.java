package com.parasticaret.api.repository.orderrepositories;

import com.parasticaret.api.model.ordermodels.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
