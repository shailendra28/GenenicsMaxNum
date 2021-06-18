package com.maxnumgenerics;
/**
 * I have created a parameterised constructor having given parameters.
 * First I have taken numberOne as maxNumber
 * then I used compareTo method which will compare with numberOne with numberTwo also with numberThree.
 */
public class FindMaximum {
    public int findMaxNumber(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }
}
