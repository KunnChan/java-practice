package org.kunnchan.practice;
/*
 * Created by kunnchan on 27/07/2020
 * package :  org.kunnchan.practice
 */

public class PropertyGuru {

    // Property Guru / 100%
    boolean countAB(String str) {

        char charA = 'a', charB = 'b';
        boolean foundA = false, foundB = false;
        if (str.length() == 1 && str.charAt(0) == charB) {
            return true;
        }
        for (int i = str.length(); i < 0; i--) {
            if (str.charAt(i) == charA) {
                foundA = true;
            }
            if (str.charAt(i) == charB) {
                foundB = true;
                foundA = false;
            }
            if (foundB && foundA) {
                return false;
            }
        }
        return true;
    }

    // Property Guru / 10%
    int getMaxValue(int N) {

        int firstDigit = Math.abs(N);
        char[] digits = String.valueOf(firstDigit).toCharArray();
        char[] resultArr = new char[digits.length + 1];
        boolean isAlreadyAdd = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] <= '5' && !isAlreadyAdd) {
                resultArr[i] = '5';
                resultArr[i + 1] = digits[i];
                isAlreadyAdd = true;
            } else {
                if (isAlreadyAdd) {
                    resultArr[i + 1] = digits[i];
                } else {
                    resultArr[i] = digits[i];
                }
            }
        }
        if (!isAlreadyAdd) {
            resultArr[0] = '5';
            for (int i = 0; i < digits.length; i++) {
                resultArr[i + 1] = digits[i];
            }
        }
        Integer res = Integer.parseInt(new String(resultArr));

        return N >= 0 ? res : res * -1;
    }

    //Property Guru / 50%
    int countPairArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i < j && arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        return count < 1_000_000_000 ? count : 1_000_000_000;
    }
}
