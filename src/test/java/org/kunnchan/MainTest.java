package org.kunnchan;
/*
 * Created by kunnchan on 26/07/2020
 * package :  PACKAGE_NAME
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testCenterElement() {
        int[] arr = {3, 1, 5, 4};
        int result = main.centerElement(arr);
        assertEquals(1, result);
    }

    @Test
    void testSumOfOddAndEven() {
        int[] arr = {1, 1};
        int result = main.sumOfOddAndEven(arr);
        assertEquals(1, result);
    }

    @Test
    void testReverseInt() {
        int result = main.reverseInt(123);
        assertEquals(321, result);
    }

    @Test
    void testReverseIntNoDataStructure() {
        int result = main.reverseIntNoDataStructure(123);
        assertEquals(321, result);
    }

    @Test
    void testCommonContent() {
        int[] first = {1, 1};
        int[] second = {1, 1};
        int[] result = main.commonContent(first, second);
        assertEquals(1, result);
    }

    @Test
    void testCommonContentV2() {
        int[] first = {1, 1};
        int[] second = {1, 1};
        int[] result = main.commonContentV2(first, second);
        assertEquals(1, result);
    }

    @Test
    void testPoe() {
        int[] arr = {1, 1};
        int result = main.poe(arr);
        assertEquals(1, result);
    }

    @Test
    void testPoeV2() {
        int[] arr = {1, 1};
        int result = main.poeV2(arr);
        assertEquals(1, result);
    }

    @Test
    void testFindSecondLargestElement() {
        int[] arr = {1, 1};
        int result = main.findSecondLargestElement(arr);
        assertEquals(1, result);
    }

    @Test
    void testFunOddEvenDiff() {
        int[] arr = {1, 1};
        int result = main.funOddEvenDiff(arr);
        assertEquals(1, result);
    }

    @Test
    void testGetChars() {
        char[] arr = {'1', '1'};
        char[] result = main.getChars(arr, 0, 2);
        assertEquals(1, result);
    }

    @Test
    void testFun2ndLargest() {
        int[] arr = {1, 2, 3};
        int result = main.fun2ndLargest(arr);
        assertEquals(2, result);
    }

    @Test
    void testFunOddMinusEven() {
        int[] arr = {1, 2, 3};
        int result = main.funOddMinusEven(arr);
        assertEquals(2, result);
    }

    @Test
    void testGetChar() {
        char[] result = main.getChar(new char[]{'a', 'b', 'c'}, 2, 1);
        assertArrayEquals(new char[]{'c'}, result);
    }

    @Test
    void testNextPerfectSquare() {
        int result = main.nextPerfectSquare(12);
        assertEquals(2, result);
    }

    @Test
    void testNupCount() {
        int result = main.nUpCount(new int[]{1, 2, 3}, 2);
        assertEquals(2, result);
    }

    @Test
    void testPrimeCount() {
        int result = main.primeCount(3, 5);
        assertEquals(2, result);
    }

    @Test
    void testIsMadHavArray() {
        int result = main.isMadHavArray(new int[]{1, 2, 3});
        assertEquals(2, result);
    }
}
