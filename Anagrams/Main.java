/*
    X and Y are anagrams if by rearranging the letters of X,
    we can get Y using all the original letters of X exactly once
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

    static boolean anagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (char c: s1.toCharArray()) {
            if (!freq.containsKey(c)) {
                freq.put(c, 1);
            } else {
                freq.put(c, freq.get(c) + 1);
            }
        }

        for (char c: s2.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);
            } else {
                // Definitely not anagrams
                return false;
            }

            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "tommarvoloriddle";
        String s2 = "iamlordvoldemort";

        System.out.println(anagrams(s1, s2));
    }
}
