/*
    Find pairs with given sum in array
 */

import java.util.*;

public class Main {
    // Sorting method
    // Time complexity: O(n * log(n))
    // This won't get all the possible pairs if the numbers are not distinct
    private static void printPairsWithSum(int[] arr, int sum) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println(low + " " + high);
                ++low;
                -- high;
            } else if (arr[low] + arr[high] < sum) {
                ++low;
            } else {
                --high;
            }
        }
    }

    // HashMap method
    // Time complexity: O(n)
    // This won't get all the possible pairs if the numbers are not distinct
    private static void printPairsWithSum2(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            if (map.containsKey(sum - arr[i])) {
                System.out.println(map.get(sum - arr[i]) + " " + i);
            }

            map.putIfAbsent(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        printPairsWithSum(arr, sum);
        System.out.println("---");
        printPairsWithSum2(arr, sum);
    }
}
