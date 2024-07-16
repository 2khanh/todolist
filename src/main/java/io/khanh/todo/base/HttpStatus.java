package io.khanh.todo.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum HttpStatus {

    OUT_OF_EXCEPTION(49999, "Out of Exception Definition!");

    int code;

    String message;

}
