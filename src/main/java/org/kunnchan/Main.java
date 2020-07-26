package org.kunnchan;
/*
 * Created by kunnchan on 26/07/2020
 * package :  PACKAGE_NAME
 */

public class Main {

    int centerElement(int[] a) {
        if (a == null || a.length % 2 == 0) return 0;
        int midIndex = a.length / 2;
        int middleItem = a[midIndex];
        for (int i = 0; i < a.length; i++) {
            if (i != midIndex && middleItem >= a[i]) {
                System.out.println(i + " : " + midIndex + " : " + middleItem + " ?? " + a[i]);
            }
            // return 0;
            else {
                System.out.println("E");
            }
        }
        return 1;
    }

    int sumOfOddAndEven(int[] a) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];
            } else {
                oddSum += a[i];
            }
        }
        return oddSum - evenSum;
    }

    char[] chars(char[] a, int start, int len) {
        char[] b = new char[len];
        if (start < 0 || len < 0 || a.length <= start + len - 1) {
            return null;
        }
        for (int i = 0; i < len; i++) {
            b[i] = a[start];
            start++;
        }
        return b;
    }

    int reverseInt(int n) {

        String numberString = n + "";
        String sign = "";
        if (n < 0) {
            sign = "-";
            numberString = numberString.substring(1);
        }

        String res = "";
        for (int i = numberString.length(); i > 0; i--) {
            res += numberString.substring(i - 1, i);
        }
        res = sign + res;
        return Integer.parseInt(res);
    }

    int reverseIntNoDataStructure(int n) {

        if (n == 0) return 0;
        int sign = 1;
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }

    int[] commonContent(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }
        int length = first.length < second.length ? first.length : second.length;
        int[] copy = new int[length];
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    copy[count] = first[i];
                    count++;
                }
            }
        }
        int[] retArr = new int[count];
        for (int i = 0; i < count; i++) {
            retArr[i] = copy[i];
        }
        return retArr;
    }

    int[] commonContentV2(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int min = (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
        int[] retArray = new int[k];
        for (int t = 0; t < retArray.length; t++)
            retArray[t] = c[t];
        return retArray;
    }

    int poe(int[] a) {
        if (a.length < 3) return -1;
        int leftSum = a[0];
        int rightSum = a[a.length - 1];
        int idx = 1;
        int i = 0, j = a.length - 1;
        for (int k = 1; k < a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        return -1;
    }

    int poeV2(int[] a) {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

    int findSecondLargestElement(int[] a) {
        if (a.length < 2 || a[0] == a[1])
            return -1;

        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] != max1 && a[i] > max2) {
                max2 = a[i];
            }
        }
        return max2;
    }

    int funOddEvenDiff(int[] a) {
        int X = 0, Y = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                Y += a[i];
            } else {
                X += a[i];
            }
        }
        return X - Y;
    }

    char[] getChars(char[] c, int start, int length) {
        if (start < 0 || length < 0 || length >= c.length - start + 1)
            return null;
        char[] copy = new char[length];

        for (int i = 0; i < length; i++) {
            copy[i] = c[start];
            start++;
        }
        return copy;
    }

    int fun2ndLargest(int[] a) {
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] != max1 && a[i] > max2) {
                max1 = a[i];
            }
        }
        return max2;
    }

    int funOddMinusEven(int[] a) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];
            } else {
                oddSum += a[i];
            }
        }
        return oddSum - evenSum;
    }

    char[] getChar(char[] a, int start, int len) {
        if (start < 0 || len < 0 || a.length <= len - start + 1 || start > a.length - 1)
            return null;

        char[] copy = new char[len];
        for (int i = 0; i < len; i++) {
            copy[i] = a[start];
            start++;
        }
        return copy;
    }

    int nextPerfectSquare(int a) {
        if (a < 0)
            return 0;

        double sqrt = Math.sqrt(a);
        int intVal = (int) sqrt + 1;

        return (int) Math.pow(intVal, 2);
    }

    int nUpCount(int[] a, int n) {
        int upcount = 0, previousPartialSum = 0, partialSum = 0;
        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];

            if (previousPartialSum <= n && partialSum > n) {
                upcount++;
            }
        }
        return upcount;
    }

    int primeCount(int start, int end) {

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i > 0) {
                boolean isPrime = true;
                for (int divider = 2; divider < i / 2; divider++) {
                    if (i % divider == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    count++;
            }
        }
        return count;
    }

    int isMadHavArray(int[] a) {
        int res = a[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0, index = i; j < i; j++) {

                System.out.println(i + " : " + a[index]);
                index++;
            }
        }
        return 0;
    }

}
