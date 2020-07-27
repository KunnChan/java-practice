package org.kunnchan.practice;
/*
 * Created by kunnchan on 28/07/2020
 * package :  org.kunnchan.practice
 */

public class MsMiu {

    int centerElement(int[] arr) {

        int length = arr.length;
        if (arr != null && length % 2 == 0) {
            return 0;
        }
        int middleIndex = length / 2;
        for (int i = 0; i < length; i++) {
            if (i != middleIndex && arr[i] <= arr[middleIndex]) {
                return 0;
            }
        }
        return 1;
    }

    int sumOfEvenOddArray(int[] arr) {
        int X = 0; // sum of odd index
        int Y = 0; // sum of even index
        if (arr == null) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Y += arr[i];
            } else {
                X += arr[i];
            }
        }
        return X - Y;
    }

    char[] getCharArray(char[] arr, int start, int len) {
        int length = arr.length;
        if (start > length || start < 0 || start + len > length) {
            return null;
        }
        char[] result = new char[len];

        for (int i = 0, j = start; i < len; i++, j++) {
            result[i] = arr[j];
        }
        return result;
    }

    int reverseInteger(int value) {
        int reverse = 0;
        while (value != 0) {
            reverse = (reverse * 10) + (value % 10);
            value = value / 10;
        }
        return reverse;
    }

    int[] getCommonElement(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int maxLength = first.length > second.length ? first.length : second.length;
        int[] tempArr = new int[maxLength];
        int index = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    tempArr[index] = first[i];
                    index++;
                }
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = tempArr[i];
        }

        return result;
    }
}
