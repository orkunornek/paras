package com.parasticaret.api.repository.orderrepositories;

import com.parasticaret.api.model.ordermodels.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
