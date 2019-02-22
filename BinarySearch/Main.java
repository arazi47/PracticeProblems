/*
    Binary search implementation
 */

import java.util.Arrays;

public class Main {
    private static int binarySearch(int arr[], int l, int r, int key) {
        if (r >= l) {
            int m = (l + r) / 2;

            if (arr[m] == key) {
                return m;
            } else if (arr[m] < key) {
                return binarySearch(arr, m + 1, r, key);
            } else if (arr[m] > key) {
                return binarySearch(arr, l, m - 1, key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -5, 4, 8, 3, 2, -11, -100, 92, 99, 82, 783, 182 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 922));
    }
}
