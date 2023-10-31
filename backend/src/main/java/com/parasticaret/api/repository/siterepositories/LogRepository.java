package com.parasticaret.api.repository.siterepositories;

import com.parasticaret.api.model.sitemodels.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
