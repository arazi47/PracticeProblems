/*
    Sieve of Eratosthenes
 */

import java.util.*;

public class Main {
	// Returns a list containing the prime numbers
	// Up to a given number "n"
    public static List<Integer> primesUpToN(int n) {
        List<Integer> res = new ArrayList<>();
        if (n <= 1) {
            return res;
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[2] = true;

        for (int i = 2; i <= n; ++i) {
            if (isPrime[i]) {
                res.add(i);
                for (int j = i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(primesUpToN(100));
    }
}
