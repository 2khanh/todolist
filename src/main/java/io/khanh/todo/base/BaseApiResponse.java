package io.khanh.todo.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseApiResponse<T> {

    int code;

    String message;

    T data;

    public BaseApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
