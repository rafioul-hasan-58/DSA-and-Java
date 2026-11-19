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

    static void majorityElement(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int val : nums) {
            int freq = 0;
            for (int ele : nums) {
                if (ele == val) {
                    freq++;
                }
            }
            if (freq > n / 2) {
                System.out.println(val);
            }
        }
    }

    static void removeDuplicate(int[] nums) {
        int str = nums[0];
        int[] uniqueArray = new int[nums.length];
        int arrayIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != str) {
                uniqueArray[arrayIndex] = str;
                str = nums[i];
                arrayIndex++;
            }
        }
        System.out.println(java.util.Arrays.toString(uniqueArray));
    }

    static void removeDuplicateTwo(int[] nums) {
        int idx = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[idx]) {
                idx++;
                nums[idx] = nums[j];
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }

    static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[idx] = nums[j];
                idx++;
            }
        }
        return idx;
    }

    static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if(nums1[idx]<nums2[i]){
                nums1[idx]=nums2[i];
            }
        }
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        int m = 3;
        int n = 3;

        mergeArray(nums1, m, nums2, n);

        System.out.println(java.util.Arrays.toString(nums1));
    }
}