package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.CustomerFavoriteItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFavoriteItemRepository extends JpaRepository<CustomerFavoriteItem, Long> {
}
