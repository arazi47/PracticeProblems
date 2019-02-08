/*
    Generate all the permutations of a given string
 */

public class Main {
    private static String swap2Chars(String s, int i, int j) {
        char[] schar = s.toCharArray();
        char c = schar[i];
        schar[i] = schar[j];
        schar[j] = c;

        return String.valueOf(schar);
    }

    // Generate permutations for string s from i (start index) to n - 1 (end index)
    private static void permutations(String s, int i, int n) {
        if (i == n - 1) {
            System.out.println(s);
        }

        for (int j = i; j < n; ++j) {
            s = swap2Chars(s, i, j);
            permutations(s, i + 1, n);
            s = swap2Chars(s, i, j);
        }
    }

    public static void main(String[] args) {
        String s = "ABCD";
        int n = s.length();
        permutations(s, 0, n);
    }
}
