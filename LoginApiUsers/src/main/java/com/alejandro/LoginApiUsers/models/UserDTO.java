package com.alejandro.LoginApiUsers.models;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
    private Role role;
    public enum Role{ADMIN, USER, JOURNALIST}
}