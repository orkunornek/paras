package com.parasticaret.api.repository.addressrepositories;

import com.parasticaret.api.model.addressmodels.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
