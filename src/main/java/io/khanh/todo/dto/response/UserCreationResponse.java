package io.khanh.todo.dto.response;

import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationResponse {

    String uuid;

    String username;

    String password;

    String email;

    String phoneNumber;

    String firstName;

    String lastName;

    LocalDate birthday;

    Date createAt;

}
