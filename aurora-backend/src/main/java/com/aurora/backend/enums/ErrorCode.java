package com.aurora.backend.enums;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1003, "User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1004, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1005, "You do not have permission", HttpStatus.FORBIDDEN),
    USERNAME_INVALID(1006, "Username must be at least 4 characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1007, "Password must be at least 6 characters", HttpStatus.BAD_REQUEST),
    USER_UPDATE_FAILED(1008, "Failed to update user", HttpStatus.BAD_REQUEST),
    USER_DELETE_FAILED(1009, "Failed to delete user", HttpStatus.BAD_REQUEST),
    USERNAME_REQUIRED(1010, "Username is required", HttpStatus.BAD_REQUEST),
    PASSWORD_REQUIRED(1011, "Password is required", HttpStatus.BAD_REQUEST),
    FIRSTNAME_REQUIRED(1012, "First name is required", HttpStatus.BAD_REQUEST),
    LASTNAME_REQUIRED(1013, "Last name is required", HttpStatus.BAD_REQUEST),
    DOB_INVALID(1014, "Date of birth must be in the past", HttpStatus.BAD_REQUEST),
    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}