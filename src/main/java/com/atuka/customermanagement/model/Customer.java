package com.atuka.customermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    private Long customerID;
    @NotBlank(message = "Name should not be Empty")
    private String customerName;
    private Gender gender;
    private String phoneNumber;
    private Long orderNumber;
    @NotBlank(message = "Email should not be Empty")
    @Email(message = "Email Should be in a correct format")
    private String email;

    public Customer() {
    }

    public enum Gender {
        MALE, FEMALE
    }
}

