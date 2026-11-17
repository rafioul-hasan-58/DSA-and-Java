package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    static void smallestValue(int[] numbers) {
        int min = numbers[0];
        int mixIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                mixIdx = i;
            }
        }
        System.out.println(mixIdx);
    }

    static void largestValue(int[] numbers) {
        int max = numbers[0];
        int maxIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIdx = i;
            }
        }
        System.out.println(maxIdx);
    }

    static void chnageArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
    }

    static int linerSearch(int[] numbers, int tar) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == tar) {
                return i;
            }
        }
        return -1;

    }

    static int[] reverseArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        return numbers;
    }

    static ArrayList<Integer> sumPair(ArrayList<Integer> nums, int tar) {

        int str = 0;
        int end = nums.size() - 1;
        ArrayList<Integer> indexes = new ArrayList<>();

        while (str < end) {
            int pairSum = nums.get(str) + nums.get(end);

            if (pairSum < tar) {
                str++;
            } else if (pairSum > tar) {
                end--;
            } else {
                indexes.add(str);
                indexes.add(end);
                return indexes;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 26;
        System.out.println(sumPair(nums, target));
    }
}