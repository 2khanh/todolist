package io.khanh.todo.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationRequest {

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
