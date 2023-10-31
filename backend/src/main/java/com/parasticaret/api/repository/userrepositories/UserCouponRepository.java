package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.CustomerCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCouponRepository extends JpaRepository<CustomerCoupon, Long> {
}
