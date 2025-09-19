package com.visatracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
@Data
public class VisaHolderDTO {

    @NotBlank(message = "Passport number is required")
    private String passportNo;

    @NotBlank(message = "Visa number is required")
    private String visaNo;

    @NotNull(message = "Visa expiry date is required")
    private LocalDate visaExpiryDate;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Nationality is required")
    private String nationality;

}
