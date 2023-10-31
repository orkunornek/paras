package com.parasticaret.api.repository.orderrepositories;

import com.parasticaret.api.model.ordermodels.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
