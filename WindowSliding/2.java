/*
    Given an array and a positive integer k, find the first negative integer
    for each and every window (contiguous subarray) of size k.
    If a window does not contain a negative integer,
    then print 0 for that window.
 */

public class Main {

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;

        boolean foundForCurrentWindow = false;
        int i = 0;
        while (i < n - k + 1) {
            foundForCurrentWindow = false;
            for (int j = i; j < i + k && j < n - k + 1; ++j) {
                if (arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    foundForCurrentWindow = true;
                    break;
                }
            }

            if (!foundForCurrentWindow) {
                System.out.print(0 + " ");
            }

            ++i;
        }
    }
}
