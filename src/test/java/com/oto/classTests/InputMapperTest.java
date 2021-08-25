package com.oto.classTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import static com.oto.input.InputMapper.parseAndMap;

/**
 * Class provides tests for parseAndMap method from InputMapper class
 */

@RunWith(Parameterized.class)
public class InputMapperTest {
    private final String[] input;
    private final Integer[] expected;

    public InputMapperTest(String[] input, Integer[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> cases() {
        return Arrays.asList(new Object[][] {
                {new String[]{}, new Integer[]{}},
                {new String[]{"5"}, new Integer[]{5}},
                {new String[]{"5", "4", "3", "2", "1"}, new Integer[]{5,4,3,2,1}}
        });
    }

    @Test
    public void inputMappingTest() {
        assertArrayEquals(expected, parseAndMap(input));
    }
}
