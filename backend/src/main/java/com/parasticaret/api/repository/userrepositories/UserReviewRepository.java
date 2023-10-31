package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.CustomerReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReviewRepository extends JpaRepository<CustomerReview, Long> {
}
