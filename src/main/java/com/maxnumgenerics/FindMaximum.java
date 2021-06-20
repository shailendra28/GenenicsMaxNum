package com.maxnumgenerics;
public class FindMaximum {
    /**
     * Here I have used Generic functions.
     * here E is the type of data.
     * Gradually it will return the max value.
     * firstValue,secondValue,thirdValue
     */
    public <E extends Comparable<E>> E findMax(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
}