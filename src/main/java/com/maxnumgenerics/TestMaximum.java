package com.maxnumgenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Here I have refactored the class as well as methods.
 * Here it's a Generic class having type E.
 * Took 3 values.
 *  <E>
 */
public class TestMaximum <E extends Comparable<E>>{
    E firstValue, secondValue, thirdValue;
    /**
     * Here this is a parameterised constructor having these parameters to initiate the values.
     *  firstValue,secondValue,thirdValue
     */
    TestMaximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
    /**
     * This is a default constructor.
     */
    public TestMaximum() {
    }

    /**
     * Here I have created a method of return type E.
     */
    public E testMaximum() {
        return testMaximum(firstValue, secondValue, thirdValue);
    }

    /**
     * In this method ..it'll check the values and give the maximum as an output.
     * <E>
     */
    public static <E extends Comparable<E>> E testMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
    /**
     * Here I have created an array which will take more than one parameter.
     * args  <E>
     */
    public static <E extends Comparable<E>> E testMaximumMore(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}


