package io.khanh.todo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserUpdateRequest {

    @Size(min = 4, message = "")
    String username;

    @Size(min = 8, message = "")
    String password;

    @Email(message = "")
    String email;

    @Size(min = 10, max = 20, message = "")
    String phoneNumber;

    @Size(min = 2, message = "")
    String firstName;

    @Size(min = 2, message = "")
    String lastName;

    LocalDate birthday;

}
