package com.parasticaret.api.repository.orderrepositories;

import com.parasticaret.api.model.ordermodels.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}
