package org.kunnchan.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CodilityTest {

    Codility clazz;

    @BeforeEach
    void setUp() {
        clazz = new Codility();
    }

    @Test
    void testGetMaxGap() {
        int result = clazz.getMaxGap(1);
        assertEquals(1, result);
    }

    @Test
    void testGetRotate() {
        int[] result = clazz.getRotate(new int[]{1, 2, 3, 4}, 2);
        assertArrayEquals(new int[]{3, 4, 2, 1}, result);
    }

    @Test
    void testGetUnpairValue() {
        int result = clazz.getUnpairValue(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertEquals(1, result);
    }

    @Test
    void testGetMissingElement() {
        int result = clazz.getMissingElement(new int[]{1, 2, 3, 5});
        assertEquals(1, result);
    }

    @Test
    void testFrogJump() {
        int result = clazz.frogJump(0, 90, 30);
        assertEquals(1, result);
    }

    @Test
    void testGetBinaryChar() {
        int result = clazz.getBinaryChar(12);
        assertEquals(12, result);
    }

    @Test
    void testGetIndex() {
        int result = clazz.getIndex(new int[]{3, 5, 6, 3, 3, 5});
        assertEquals(1, result);
    }
}