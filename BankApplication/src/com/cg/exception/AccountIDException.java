package com.cg.exception;

public class AccountIDException extends RuntimeException{
    public String getMessage() {

        return "Invalid account ID";
    }
}