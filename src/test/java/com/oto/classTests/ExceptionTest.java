package com.oto.classTests;

import com.oto.exceptions.IllegalAmountOfArgumentsException;
import com.oto.exceptions.WrongArgumentFormatException;
import org.junit.Test;

import static com.oto.input.InputMapper.parseAndMap;
import static com.oto.SortingApp.runApp;

/**
 * Class provides tests for throwing exceptions
 */
public class ExceptionTest{

    @Test (expected = WrongArgumentFormatException.class)
    public void illegalArgumentFormatExceptionTest() {
        parseAndMap(new String[]{"1", "3", "1.2", "4"});
    }

    @Test (expected = IllegalAmountOfArgumentsException.class)
    public void illegalArgAmountExceptionTest() throws IllegalAmountOfArgumentsException {
        runApp(new String[]{"1", "3", "3323", "32323", "3", "323", "323", "323", "-323", "-5", "14"});
    }

}
