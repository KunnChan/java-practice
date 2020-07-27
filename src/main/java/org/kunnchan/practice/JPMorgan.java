package org.kunnchan.practice;
/*
 * Created by kunnchan on 28/07/2020
 * package :  org.kunnchan.practice
 */

import java.util.*;
import java.util.regex.Pattern;

public class JPMorgan {

    String checkStrength(String password) {
        Pattern strongPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$&*]).{10,25}$");
        Pattern mediumPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,25}$");
        Pattern noSpacePattern = Pattern.compile("^\\S*$");
        Pattern weakPattern = Pattern.compile("^.{6,25}$");

        if (strongPattern.matcher(password).matches()) {
            return "strong";
        } else if (mediumPattern.matcher(password).matches()) {
            return "medium";
        } else if (noSpacePattern.matcher(password).matches() && weakPattern.matcher(password).matches()) {
            return "weak";
        } else {
            return "invalid";
        }
    }

    int priceCheck(List<String> products, List<Float> productPrices,
                   List<String> productSold, List<Float> soldPrice) {

        Map<String, Float> productMap = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            String key = products.get(i);
            Float value = productPrices.get(i);
            productMap.put(key, value);
        }

        int errorCount = 0;
        for (int i = 0; i < productSold.size(); i++) {
            String soldProduct = productSold.get(i);
            Float price = soldPrice.get(i);
            Float originalPrice = productMap.get(soldProduct);
            if (!originalPrice.equals(price)) {
                errorCount++;
            }
        }

        return errorCount;
    }

    int collision(List<Integer> speed, int pos) {

        int posSpeed = speed.get(pos);
        int collisionCount = 0;
        for (int i = 0; i < speed.size(); i++) {
            if (i < pos) {
                if (speed.get(i) > posSpeed) {
                    collisionCount++;
                }
            } else if (i > pos) {
                if (speed.get(i) < posSpeed) {
                    collisionCount++;
                }
            }
        }
        return collisionCount;
    }

    char maximumOccurringCharacter(String text) {
        // Write your code here

        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : text.toCharArray()) {
            if (map.containsKey(ch)) {
                int value = map.get(ch) + 1;
                map.put(ch, value);
            } else {
                map.put(ch, 1);
            }
        }

        Map.Entry<Character, Integer> maxEntry = Collections.max(map.entrySet(),
                Comparator.comparing(Map.Entry::getValue));

        return maxEntry.getKey();
    }

    int circularArray(int n, List<Integer> endNode) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < endNode.size() - 1; i++) {
            Integer start = endNode.get(i);
            Integer end = endNode.get(i + 1);

            for (int j = start; j <= end; j++) {

                if (map.containsKey(j)) {
                    int value = map.get(j) + 1;
                    map.put(j, value);
                } else {
                    map.put(j, 1);
                }
            }

        }
        Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(),
                Comparator.comparing(Map.Entry::getValue));

        return maxEntry.getKey();
    }
}
