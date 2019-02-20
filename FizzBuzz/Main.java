/*
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print “Fizz” instead of the number
    and for the multiples of five print “Buzz”.
    For numbers which are multiples of both three and five print “FizzBuzz”.
 */

public class Main {
    public static void fizzBuzz1() {
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz2() {
        for (int i = 1; i <= 100; ++i) {
            String res = "";
            boolean flag = false;
            if (i % 3 == 0) {
                res += "Fizz";
                flag = true;
            }

            if (i % 5 == 0) {
                res += "Buzz";
                flag = true;
            }

            if (flag) {
                System.out.println(res);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz1();
        //fizzBuzz2();
    }
}
