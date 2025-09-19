package com.visatracker.service;

import com.visatracker.dto.VisaHolderDTO;
import org.springframework.http.ResponseEntity;

public interface VisaTrackerService {
    ResponseEntity<String> addVisaHolder(VisaHolderDTO dto);
}
