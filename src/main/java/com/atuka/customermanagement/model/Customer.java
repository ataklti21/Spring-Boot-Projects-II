package com.atuka.customermanagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Customer {

    private final Long customerID;
    @NotBlank(message = "Name should not be Empty")
    private final String customerName;
    private final Gender gender;
    private final String phoneNumber;
    private final Long orderNumber;
    @NotBlank(message = "Email should not be Empty")
    @Email(message = "Email Should be in a correct format")
    private final String email;

    public enum Gender {
        MALE, FEMALE
    }


}

