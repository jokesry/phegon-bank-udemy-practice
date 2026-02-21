package com.phegon.phegonbank.auth_users.dtos;

import com.phegon.phegonbank.role.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class RegistrationRequest {
    @NotBlank(message = "FirstName is required")
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @NotBlank(message = "Email is required")
    @Email
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
