package io.khanh.todo.exception;

import io.khanh.todo.base.HttpStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@RequiredArgsConstructor
public class UserRuntimeException extends RuntimeException {

    HttpStatus httpStatus;

}
