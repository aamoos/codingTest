package com.codingTest.harucoading.Day19;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        int index = scan.nextInt();
        System.out.println(text.charAt(index-1));
    }
}