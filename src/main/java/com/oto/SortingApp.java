package com.oto;

import com.oto.exceptions.IllegalAmountOfArgumentsException;
import com.oto.exceptions.WrongArgumentFormatException;

import static com.oto.input.InputMapper.parseAndMap;
import static com.oto.impl.Sort.sort;
import static com.oto.output.OutputFormatter.formatIntArray;
import static com.oto.output.OutputFormatter.formatResult;

/**
 * SortingApp class for command line sorting app
 *
 */
public class SortingApp
{
    /**
     *
     * @param args Sequence of integers to sort and print
     */
    public static void main( String[] args ) throws IllegalAmountOfArgumentsException {
        runApp(args);
    }

    public static void runApp(String[] args)
            throws IllegalAmountOfArgumentsException, WrongArgumentFormatException{
        if (args.length > 10)
            IllegalAmountOfArgumentsException.throwException();
        Integer[] array = parseAndMap(args);
        sort(array);
        String resultAsString = formatIntArray(array);
        resultAsString = formatResult(resultAsString);
        System.out.println(resultAsString);
    }
}
