package com.codingTest.harucoading.브론즈4.Day6;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int min_f = Math.min(A,Math.min(B, C));

        int D = scan.nextInt();
        int F = scan.nextInt();
        int min_s = Math.min(D, F);

        System.out.println(min_f+min_s-50);
    }
}