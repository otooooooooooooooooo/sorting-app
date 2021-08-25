package com.oto.exceptions;

public class IllegalAmountOfArgumentsException extends Exception{
    public IllegalAmountOfArgumentsException(String message) {
        super(message);
    }

    public static void throwException() throws IllegalAmountOfArgumentsException {
        throw new IllegalAmountOfArgumentsException("Number of arguments  <= 10 expected.\n");
    }
}
