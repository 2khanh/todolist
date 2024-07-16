package io.khanh.todo.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    boolean isAuthenticated;

}
