package org.kunnchan.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MsMiuTest {

    MsMiu clazz;

    @BeforeEach
    void setUp() {
        clazz = new MsMiu();
    }

    @Test
    void testCenterElement() {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {3, 2, 1, 4, 5};
        int[] third = {3, 2, 1, 4, 1};
        int[] fourth = {1, 2, 3, 4};
        int[] fifth = {};
        int[] sixth = {10};

        assertEquals(0, clazz.centerElement(first));
        assertEquals(1, clazz.centerElement(second));
        assertEquals(0, clazz.centerElement(third));
        assertEquals(0, clazz.centerElement(fourth));
        assertEquals(0, clazz.centerElement(fifth));
        assertEquals(1, clazz.centerElement(sixth));
    }

    @Test
    void testSumOfEvenOddArrayTest() {

        int[] first = {1};
        int[] second = {1, 2};
        int[] third = {1, 2, 3};
        int[] fourth = {1, 2, 3, 4};
        int[] fifth = {3, 3, 4, 4};
        int[] sixth = {3, 2, 3, 4};
        int[] seventh = {4, 1, 2, 3};
        int[] eighth = {1, 1};
        int[] ninth = {};

        assertEquals(1, clazz.sumOfEvenOddArray(first));
        assertEquals(-1, clazz.sumOfEvenOddArray(second));
        assertEquals(2, clazz.sumOfEvenOddArray(third));
        assertEquals(-2, clazz.sumOfEvenOddArray(fourth));
        assertEquals(-2, clazz.sumOfEvenOddArray(fifth));
        assertEquals(0, clazz.sumOfEvenOddArray(sixth));
        assertEquals(-2, clazz.sumOfEvenOddArray(seventh));
        assertEquals(2, clazz.sumOfEvenOddArray(eighth));
        assertEquals(0, clazz.sumOfEvenOddArray(ninth));
    }

    @Test
    void testGetCharArray() {
        assertArrayEquals(new char[]{'a', 'b', 'c'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 0, 3));
        assertArrayEquals(new char[]{'a'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 0, 1));
        assertArrayEquals(new char[]{'a', 'b'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 0, 2));
        assertArrayEquals(new char[]{'b', 'c'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 1, 2));
        assertArrayEquals(new char[]{'b'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 1, 1));
        assertArrayEquals(new char[]{'c'}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 2, 1));
        assertArrayEquals(new char[]{}, clazz.getCharArray(new char[]{'a', 'b', 'c'}, 1, 0));

        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, 0, 4));
        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, 3, 1));
        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, 2, 2));
        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, -1, 2));
        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, -1, -2));
        assertNull(clazz.getCharArray(new char[]{}, 0, 1));
        assertNull(clazz.getCharArray(new char[]{'a', 'b', 'c'}, 1, 3));
    }

    @Test
    void testReverseIntegerTest() {

        assertEquals(4321, clazz.reverseInteger(1234));
        assertEquals(50021, clazz.reverseInteger(12005));
        assertEquals(1, clazz.reverseInteger(1));
        assertEquals(1, clazz.reverseInteger(1000));
        assertEquals(0, clazz.reverseInteger(0));
        assertEquals(-54321, clazz.reverseInteger(-12345));
    }

    @Test
    void testCommonElement() {
        assertArrayEquals(new int[]{1, 2}, clazz.getCommonElement(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}));
        // assertThat(actual, containsInAnyOrder("c", "b", "a"));
        assertArrayEquals(new int[]{2, 6, 1}, clazz.getCommonElement(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1}));
        assertArrayEquals(new int[]{1, 3, 7, 9}, clazz.getCommonElement(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}));
        assertArrayEquals(new int[]{}, clazz.getCommonElement(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{}, clazz.getCommonElement(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, clazz.getCommonElement(new int[]{1, 2}, new int[]{}));
        assertNull(clazz.getCommonElement(new int[]{1, 2}, null));
        assertNull(clazz.getCommonElement(null, new int[]{}));
        assertNull(clazz.getCommonElement(null, null));
    }
}