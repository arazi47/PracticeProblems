/*
    Compute the maximum product of a triplet in a given array

    https://www.geeksforgeeks.org/find-maximum-product-of-a-triplet-in-array/
    (Approach 2)

    O(n) time complexity
    O(n) space complexity
 */

import java.util.*;

public class Main {
    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int maxProduct(int arr[]) {
        if (arr.length < 3) {
            return -1;
        } else if (arr.length == 3) {
            return arr[0] * arr[1] * arr[2];
        }

        int leftMin[] = new int[arr.length];
        Arrays.fill(leftMin, -1);

        int leftMax[] = new int[arr.length];
        Arrays.fill(leftMax, -1);

        int rightMin[] = new int[arr.length];
        Arrays.fill(rightMin, -1);

        int rightMax[] = new int[arr.length];
        Arrays.fill(rightMax, -1);

        int minEl = arr[0];
        int maxEl = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            leftMin[i] = minEl;
            if (arr[i] < minEl) {
                minEl = arr[i];
            }

            leftMax[i] = maxEl;
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }

        minEl = arr[arr.length - 1];
        maxEl = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; --i) {
            rightMin[i] = minEl;
            if (arr[i] < minEl) {
                minEl = arr[i];
            }

            rightMax[i] = maxEl;
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }

        int maxProd = arr[0] * arr[1] * arr[2];
        for (int i = 0; i < arr.length; ++i) {
            int p1 = max(arr[i] * leftMin[i] * rightMin[i],
                         arr[i] * leftMin[i] * rightMax[i]);

            int p2 = max(arr[i] * leftMax[i] * rightMin[i],
                         arr[i] * leftMax[i] * rightMax[i]);

            maxProd = max(maxProd, max(p1, p2));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 5, 2, -4, -7};
        // 5 * (-4) * (-7) = 140
        System.out.println(maxProduct(arr));
    }
}
