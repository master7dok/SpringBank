package com.mbdev.springbank.exception;

public class NotDefaultBillAction extends RuntimeException{
    public NotDefaultBillAction(String message) {
        super(message);
    }
}
