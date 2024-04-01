package com.atuka.customermanagement.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Customer {
    @NotBlank
    private final Long customerID;
    @NotBlank
    private final String CustomerName;
    private final Gender gender;

    private final String phoneNumber;
    private final Long orderNumber;

    public enum Gender {
        MALE, FEMALE
    }
}

