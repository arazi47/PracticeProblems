/*
    Find triplet with given sum in an array
 */

import java.util.*;

public class Main {
    private static class Pair {
        int first;
        int second;

        Pair(int a, int b) {
            this.first = a;
            this.second = b;
        }
    }

    private static void triplets(int[] arr, int sum) {
        Map<Integer, Pair> twoSum = new HashMap<>();

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (i != j) {
                    twoSum.put(arr[i] + arr[j], new Pair(i, j));
                }
            }
        }

        for (int i = 0; i < arr.length; ++i) {
            int restSum = sum - arr[i];
            if (twoSum.containsKey(restSum)
                    && twoSum.get(restSum).first != i
                    && twoSum.get(restSum).second != i) {
                System.out.println(arr[i] + " + " + arr[twoSum.get(restSum).first] + " + " + arr[twoSum.get(restSum).second] + " = " + sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {32, 0, 15, 18, 21, 1, 88, 73, 44, 142, 146};
        int sum = 147;
        triplets(arr, 147);
    }
}
