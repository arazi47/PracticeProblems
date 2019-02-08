/*
    Reverse text without reversing the individual words
 */

import java.util.Stack;

public class Main {
    private static void printReversedString(String s) {
        String[] split = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (String e: split) {
            stack.push(e);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        String s = "This statament is false";
        printReversedString(s);
    }
}
