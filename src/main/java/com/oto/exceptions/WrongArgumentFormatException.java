package com.oto.exceptions;

public class WrongArgumentFormatException extends NumberFormatException{
    public WrongArgumentFormatException(String message) {
        super(message);
    }

    public static void throwException(String notParsed) throws WrongArgumentFormatException{
        throw new WrongArgumentFormatException("Argument '" + notParsed + "' couldn't be parsed. " +
                "Please provide integer arguments.\n");
    }
}
