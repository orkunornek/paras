package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.ShoppingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long> {
}
