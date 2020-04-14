package com.nchu.rebooks.Exception;

public class ReBookException extends Exception {

    private ReBookErrorMessage errorMessage;

    public ReBookException(ReBookErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ReBookErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ReBookErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage(){
        return errorMessage.getMessage();
    }
}
