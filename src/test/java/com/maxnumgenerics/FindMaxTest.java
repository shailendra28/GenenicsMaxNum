package com.maxnumgenerics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Test case program for Generics to find max values of different data types
 * created three test cases which will check and give the test case result.
 */
public class FindMaxTest {
    // I have created an Object of FindMaximum class
    FindMaximum findMax = new FindMaximum();
    // Test case for numberOne is maxnumber than numberTwo and numberThree and will return True
    @Test
    void ifNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(100, 50, 25));
    }
    // Test case for numberTwo is maxnumber than numberOne and numberThree and will return True
    @Test
    void ifNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(50, 100, 25));
    }
    // Test case for numberThree is maxnumber than numberOne and numberTwo and will return True
    @Test
    void ifNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(25, 50, 100));
    }
}