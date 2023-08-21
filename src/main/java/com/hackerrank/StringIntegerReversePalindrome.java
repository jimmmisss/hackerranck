package com.hackerrank;

import java.util.Scanner;

public class StringIntegerReversePalindrome {

    public static void main(String[] args) {

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
}
