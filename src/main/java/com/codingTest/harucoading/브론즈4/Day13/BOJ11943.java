package com.codingTest.harucoading.브론즈4.Day13;

import java.util.Scanner;

public class BOJ11943 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        // A B
        // C D
        System.out.println(Math.min(A+D, B+C));
    }
}