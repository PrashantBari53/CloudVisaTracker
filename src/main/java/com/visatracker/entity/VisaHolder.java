package com.visatracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "visa_holders")
@Data
public class VisaHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport_no", nullable = false, unique = true)
    private String passportNo;

    @Column(name = "visa_no", nullable = false)
    private String visaNo;

    @Column(name = "visa_expiry_date", nullable = false)
    private LocalDate visaExpiryDate;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "application_submitted_date")
    Timestamp startDate;

    @Column(name = "created_on")
    LocalDateTime createdOn;

    @Column(name = "created_by")
    String createdByName;
}

