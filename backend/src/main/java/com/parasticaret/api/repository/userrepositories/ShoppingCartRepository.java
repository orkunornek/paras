package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
