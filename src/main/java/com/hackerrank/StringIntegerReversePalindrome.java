package com.hackerrank;

import java.util.Scanner;

public class StringIntegerReversePalindrome {

    public static void main(String[] args) {

        //stringNumberPalindrome();
        integerPalindrome();

    }

    private static void stringNumberPalindrome() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();

        StringBuilder reverseStr = new StringBuilder();

        for(int i = (strLength - 1); i >= 0; --i) {
           reverseStr.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }
    }

    private static void integerPalindrome() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverseNum = 0, remainder;

        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is palindrome");
        } else {
            System.out.println(originalNum + " not is palindrome");
        }
    }
}
