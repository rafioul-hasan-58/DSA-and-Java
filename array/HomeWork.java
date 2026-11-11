package array;

import java.util.ArrayList;

public class HomeWork {

    static void sumOfArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is:" + " " + sum);
    }

    static void productOfArray(int[] arr) {
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println("Product is:" + " " + prod);
    }

    static void swapMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[maxIdx];
        arr[maxIdx] = temp;

        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeIndex(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

    static void printUnique(int[] arr) {
        ArrayList<Integer> dup = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            int[] newArr = removeIndex(arr, i);
            for (int j = 0; j < newArr.length; j++) {
                if (arr[i] == newArr[j]) {
                    dup.add(newArr[j]);
                }
            }
        }
        ArrayList<Integer> mainArr = new ArrayList<>();

        for (int num : arr) {
            mainArr.add(num);
        }

        for (int i = 0; i < dup.size(); i++) {
            for (int j = 0; j < mainArr.size(); j++) {
                if(dup.get(i)==mainArr.get(j)){
                    mainArr.remove(j);
                }
            }
        }

        System.out.println(mainArr);
      

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4 };
        printUnique(arr);
    }
}
