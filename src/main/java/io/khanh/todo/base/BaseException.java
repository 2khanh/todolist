package io.khanh.todo.base;

import io.khanh.todo.exception.UserRuntimeException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

@ControllerAdvice
public class BaseException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<BaseApiResponse> handlingFieldsException(
            MethodArgumentNotValidException exception
    ) {
        String exceptionKey = Objects.requireNonNull(exception.getFieldError())
                .getDefaultMessage();
        HttpStatus httpStatus = HttpStatus.OUT_OF_EXCEPTION;

        try {
            httpStatus = HttpStatus.valueOf(exceptionKey);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        BaseApiResponse apiResponse = new BaseApiResponse(
                httpStatus.getCode(),
                httpStatus.getMessage()
        );

        return ResponseEntity.badRequest().body(apiResponse);
    }

    @ExceptionHandler(value = UserRuntimeException.class)
    public ResponseEntity<BaseApiResponse> handlingUserRuntimeException(
            UserRuntimeException exception
    ) {
        HttpStatus httpStatus = exception.getHttpStatus();
        BaseApiResponse apiResponse = new BaseApiResponse<>(
                httpStatus.getCode(),
                httpStatus.getMessage()
        );

        return ResponseEntity.badRequest().body(apiResponse);
    }

}
