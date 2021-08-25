package com.oto.input;

import com.oto.exceptions.WrongArgumentFormatException;

/**
 * Class provides functionality to parse and
 * map command line inputs
 */

public class InputMapper {

    /**
     * @param toMap User input from command line
     * @return Integer array parsed from string array
     */
    public static Integer[] parseAndMap(String[] toMap) throws WrongArgumentFormatException{
        Integer[] resultIntegers = new Integer[toMap.length];
        int pointer = 0;
        for (String str : toMap) {
            try {
                resultIntegers[pointer++] = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                WrongArgumentFormatException.throwException(str);
            }
        }
        return resultIntegers;
    }
}
