package com.faculty.studentsaffairs.exception;

import lombok.Data;

@Data

public class ApiError {

    private String message;

    public ApiError(String message) {
        super();
        this.message = message;
    }
}
