package com.cg.exception;

public class AccountNameException extends RuntimeException{
    public String getMessage() {

        return "Invalid account Name";
    }
}