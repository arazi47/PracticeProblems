/*
    Given an array of integers of size ‘n’,
    calculate the maximum sum of ‘k’
    consecutive elements in the array.

    Window Sliding Technique
 */

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int n = arr.length;
        int k = 4;

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr[i];
            ++i;
        }

        int maxSum = sum;

        while (i < n) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            ++i;
        }

        System.out.println(maxSum);
    }
}
