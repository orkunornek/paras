package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, Long> {
}
