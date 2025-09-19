package com.visatracker.controller;


import com.visatracker.dto.VisaHolderDTO;
import com.visatracker.entity.VisaHolder;
import com.visatracker.service.VisaTrackerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visa-holders")
@Slf4j
public class VisaHolderController {

    private final VisaTrackerService visaTrackerService;

    public VisaHolderController(VisaTrackerService visaTrackerService) {
        this.visaTrackerService = visaTrackerService;
    }

    @GetMapping(path = "/ping", produces = "application/json")
    public String ping() {
        var response = "visa-tracker health Check Status : Running";
        return ResponseEntity.ok(response).getBody();
    }

    @PostMapping(path="/add")
    public ResponseEntity<String> addVisaHolder(@Valid @RequestBody VisaHolderDTO dto) {
        log.info("Starting visa holder save method");
        return visaTrackerService.addVisaHolder(dto);
    }


}
