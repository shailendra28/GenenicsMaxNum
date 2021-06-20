package com.maxnumgenerics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Test case program for Generics to find max values of different data types
 *  here in this test class I have created an object of main class and call all the methods of test cases.
 */
public class FindMaxTest {
    FindMaximum findMaxObj = new FindMaximum();
    /**
     * Here we have the same code only I have used E as a type.
     * that E will automatically fetch any datatypes.
     */
    @Test
    void ifIntegerNumberOneIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMaxObj.findMax(100, 50, 25));
    }

    @Test
    void ifIntegerNumberTwoIsMaxReturnTrue() {

        Assertions.assertEquals(100, findMaxObj.findMax(50, 100, 25));
    }

    @Test
    void ifIntegerNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMaxObj.findMax(25, 50, 100));
    }

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(10.0F, 5.0F, 2.5F));
    }

    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(5.0F, 10.0F, 2.5F));
    }

    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0F, findMaxObj.findMax(2.5F, 5.0F, 10.0F));
    }

    @Test
    void ifStringOneIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMaxObj.findMax("banana", "apple", "peach"));
    }

    @Test
    void ifStringTwoIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMaxObj.findMax("apple", "banana", "peach"));
    }

    @Test
    void ifStringThreeIsMaxReturnTrue() {
        Assertions.assertEquals("peach", findMaxObj.findMax("peach", "apple", "banana"));
    }
}