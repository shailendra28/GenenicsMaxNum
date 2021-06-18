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
    /**
     * Here I have created same as above test case for float
     * created three test cases which will check and give the test case result.
     */
    // Test case for FloatNumberOne is maxnumber than FloatNumberTwo and FloatNumberThree and will return True
    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(10.0F, 5.0F, 2.5F));
    }
    // Test case for FloatNumberTwo is maxnumber than FloatNumberOne and FloatNumberThree and will return True
    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(5.0F, 10.0F, 2.5F));
    }
    // Test case for FloatNumberThree is maxnumber than FloatNumberOne and FloatNumberTwo and will return True
    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(2.5F, 5.0F, 10.0F));
    }
    // Test case for StringNumberOne is maxString than StringNumberTwo and StringNumberThree and will return True
    @Test
    void ifStringNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("banana", "peach", "apple"));
    }
    // Test case for StringNumberTwo is maxString than StringNumberOne and StringNumberThree and will return True
    @Test
    void ifStringNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("apple", "banana", "peach"));
    }
    // Test case for StringNumberThree is maxString than StringNumberOne and StringNumberTwo and will return True
    @Test
    void ifStringNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMax.findMaxString("peach", "apple", "banana"));
    }
}