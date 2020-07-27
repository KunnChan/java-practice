package org.kunnchan.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyGuruTest {

    PropertyGuru clazz;

    @BeforeEach
    void setUp() {
        clazz = new PropertyGuru();
    }

    @Test
    void testCountAB() {
        assertTrue(clazz.countAB("aabbb"));
        assertFalse(clazz.countAB("ba"));
        assertTrue(clazz.countAB("aaa"));
        assertTrue(clazz.countAB("b"));
        assertFalse(clazz.countAB("abba"));
    }

    @Test
    void testGetMaxValue() {
        assertEquals(5268, clazz.getMaxValue(268));
        assertEquals(6750, clazz.getMaxValue(670));
        assertEquals(50, clazz.getMaxValue(0));
        assertEquals(520, clazz.getMaxValue(901));
        assertEquals(-1, clazz.getMaxValue(-1));
        assertEquals(-5999, clazz.getMaxValue(-999));
    }

    @Test
    void testCountPairArray() {
        assertArrayEquals(new int[]{}, new int[]{3, 3, 5, 5, 6, 3, 3, 5});
    }
}