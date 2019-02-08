/*
    Group anagrams together from a given list of words
 */

import java.util.*;

public class Main {
    private static void groupAndPrintAnagrams(String[] words) {
        Map<String, ArrayList<String>> dict = new HashMap<>();
        for (String word: words) {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String sortedWord = String.valueOf(wordChar);

            dict.putIfAbsent(sortedWord, new ArrayList<>());
            dict.get(sortedWord).add(word);
        }

        for (Map.Entry<String, ArrayList<String>> entry: dict.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String[] words = { "cars", "repaid", "dues", "nose", "signed", "lane",
                            "paired", "arcs", "grab", "used", "ones", "brag",
                            "sued", "lean", "scar", "design" };

        groupAndPrintAnagrams(words);
    }
}
