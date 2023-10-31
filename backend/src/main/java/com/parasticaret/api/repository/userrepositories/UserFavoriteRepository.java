package com.parasticaret.api.repository.userrepositories;

import com.parasticaret.api.model.usermodels.CustomerFavorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFavoriteRepository extends JpaRepository<CustomerFavorite, Long> {
}
