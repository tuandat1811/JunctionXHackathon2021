package com.deadlight.soict.hust.backend.entities;

import lombok.Data;

@Data
public class RegisterForm {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
