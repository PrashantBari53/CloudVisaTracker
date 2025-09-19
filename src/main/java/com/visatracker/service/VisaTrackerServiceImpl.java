package com.visatracker.service;

import com.visatracker.dto.VisaHolderDTO;
import com.visatracker.entity.VisaHolder;
import com.visatracker.repository.VisaHolderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VisaTrackerServiceImpl implements VisaTrackerService{

    private final VisaHolderRepository visaHolderRepository;

    public VisaTrackerServiceImpl(VisaHolderRepository visaHolderRepository) {
        this.visaHolderRepository = visaHolderRepository;
    }

    @Override
    public ResponseEntity<String> addVisaHolder(VisaHolderDTO dto){
 if (visaHolderRepository.findByPassportNo(dto.getPassportNo()).isPresent()) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Visa holder with this passport number already exists.");
    }

        VisaHolder visaHolder = new VisaHolder();
        visaHolder.setPassportNo(dto.getPassportNo());
        visaHolder.setVisaNo(dto.getVisaNo());
        visaHolder.setVisaExpiryDate(dto.getVisaExpiryDate());
        visaHolder.setFirstName(dto.getFirstName());
        visaHolder.setLastName(dto.getLastName());
        visaHolder.setNationality(dto.getNationality());

        visaHolderRepository.save(visaHolder);
        return ResponseEntity.ok("Visa holder added successfully.");

    }
}

