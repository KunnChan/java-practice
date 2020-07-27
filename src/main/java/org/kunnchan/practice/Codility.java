package org.kunnchan.practice;
/*
 * Created by kunnchan on 27/07/2020
 * package :  org.kunnchan.practice
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Codility {

    int getMaxGap(int N) {
        int maxGap = 0, currGap = 0;
        boolean isInGap = false;

        while (N > 0) {
            if (isOne(N)) {
                maxGap = maxGap < currGap ? currGap : maxGap;
                currGap = 0;
                isInGap = true;
            } else if (isInGap) {
                currGap++;
            }
            N /= 2;
        }

        return maxGap;
    }

    private boolean isOne(int N) {
        return N % 2 == 1 || N == 1;
    }

    int[] getRotate(int[] arr, int x) {
        // x = 3
        // 1,2,3,4,5
        // 2,3,4,5,1
        // 3,4,5,1,2
        for (int i = 0; i < x; i++) {
            int val = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = val;
        }
        return arr;
    }

    int getUnpairValue(int[] arr) {
        //A[0] = 9  A[1] = 3  A[2] = 9
        //A[3] = 3  A[4] = 9  A[5] = 7
        // A[6] = 9
        // 7
        int unpairkey = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]) + 1;
                map.put(arr[i], val);

            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) == 1) {
                unpairkey = arr[i];
            }
        }

        return unpairkey;
    }

    int getMissingElement(int[] A) {
        // since all distinct, we are safe.. some controls can be omitted
        // if the missing also available, sum would be n (n + 1) / 2 where n = length (A) + 1
        // tip: sums should be long, since might overflow for large n
        long shouldBeLength = A.length + 1;
        long shouldBeSum = shouldBeLength * (shouldBeLength + 1) / 2;
        return (int) (shouldBeSum - calcSum(A));

    }

    private long calcSum(int[] A) {
        long sum = 0;
        for (int elem : A) {
            sum += elem;
        }
        return sum;
    }

    int frogJump(int x, int y, int d) {
        int initialCount = (y - x) / d;
        int remainder = (y - x) % d;

        return (remainder > 0 ? initialCount + 1 : initialCount);

    }

    int getBinaryChar(int intValue) {

        String binaryString = Integer.toBinaryString(intValue);
        int zeroHit = 0;
        int longest = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.startsWith("1", i)) {
                if (zeroHit > longest) {
                    longest = zeroHit;
                }
                zeroHit = 0;
            } else {
                zeroHit++;
            }
        }
        return longest;
    }

    int getIndex(int[] arr) {
        Set<Integer> element = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element.contains(arr[i])) {
                count++;
            } else {
                element.add(arr[i]);
            }
        }
        return count;
    }

}
