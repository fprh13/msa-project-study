package com.example.userservice.vo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestUser {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 2, message = "Password not be less than two characters")
    private String pwd;

    @NotNull(message = "name cannot be null")
    @Size(min = 8, message = "name not must be  equal or grater than characters")
    private String name;

}
