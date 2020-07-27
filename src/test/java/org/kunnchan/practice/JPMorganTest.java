package org.kunnchan.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JPMorganTest {

    JPMorgan clazz;

    @BeforeEach
    void setUp() {
        clazz = new JPMorgan();
    }

    @Test
    void checkStrength() {
    }

    @Test
    void priceCheck() {
        List<String> products = Arrays.asList("aa", "bb", "cc", "dd");
        List<Float> prices = Arrays.asList(1.2f, 2.2f, 3.2f, 4.2f);
        List<String> soldProducts = Arrays.asList("aa", "bb", "bb", "cc");
        List<Float> soldPrice = Arrays.asList(1.2f, 2.2f, 3.2f, 4.2f);
        int result = clazz.priceCheck(products, prices, soldProducts, soldPrice);

        assertEquals(1, result);
    }

    @Test
    void collision() {
        List<Integer> speed1 = Arrays.asList(2, 1);
        int pos1 = 0; // result should be 1;

        List<Integer> speed2 = Arrays.asList(6, 6, 1, 6, 3, 4, 6, 8);
        int pos2 = 2; // result should be 2;

        List<Integer> speed3 = Arrays.asList(8, 3, 6, 3, 2, 2, 4, 8, 1, 6);
        int pos3 = 7; // result should be 2;

        List<Integer> speed4 = Arrays.asList(1, 3, 7, 4, 6, 4);
        int pos4 = 3; // result should be 1;

        assertEquals(1, clazz.collision(speed1, pos1));
        assertEquals(2, clazz.collision(speed2, pos2));
        assertEquals(2, clazz.collision(speed3, pos3));
        assertEquals(1, clazz.collision(speed4, pos4));

    }

    @Test
    void maximumOccurringCharacter() {
        String first = "abbbaacc"; // a
        String second = "helloworld"; // l
        String third = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"; //a

        assertEquals('a', clazz.maximumOccurringCharacter(first));
        assertEquals('l', clazz.maximumOccurringCharacter(second));
        assertEquals('a', clazz.maximumOccurringCharacter(third));
    }

    @Test
    void circularArray() {
        List<Integer> endNode1 = Arrays.asList(1, 3, 2, 3); // n = 3 => 2
        List<Integer> endNode2 = Arrays.asList(1, 5, 10, 5); // n = 10 => 5
        List<Integer> endNode3 = Arrays.asList(1, 5); // n = 5 => 1

        assertEquals(5, clazz.circularArray(10, endNode2));
        assertEquals(1, clazz.circularArray(5, endNode3));
        assertEquals(2, clazz.circularArray(3, endNode1));
    }
}