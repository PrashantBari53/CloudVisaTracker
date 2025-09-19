package com.visatracker.repository;

import com.visatracker.entity.VisaHolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisaHolderRepository extends JpaRepository<VisaHolder, Long> {
    Optional<VisaHolder> findByPassportNo(String passportNo);
}
