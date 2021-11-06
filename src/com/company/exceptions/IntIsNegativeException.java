package com.company.exceptions;

public class IntIsNegativeException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Input cant be negative";
    }
}
