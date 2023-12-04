package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotEmpty
    private String username;
    @Email
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String verifyPassword;
    private String avatar;
    private String fullName;

}
