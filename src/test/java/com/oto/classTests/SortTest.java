package com.oto.classTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import static com.oto.impl.Sort.sort;

/**
 * Class provides tests for impl.Sort.sort method
 */

@RunWith(Parameterized.class)
public class SortTest {
    private final Integer[] initial;
    private final Integer[] expected;

    public SortTest(Integer[] args, Integer[] expected) {
        this.initial = args;
        this.expected = expected;
    }

    /**
     *
     * @return 0 arg, 1 arg, 10 arg cases
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{}, new Integer[] {}},
                {new Integer[]{5}, new Integer[]{5}},
                {new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                        new Integer[]{1,2,3,4,5,6,7,8,9,10}}
        });
    }

    @Test
    public void testSortMethod() {
        sort(initial);
        assertArrayEquals(expected, initial);
    }


}