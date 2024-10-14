package com.codingTest.harucoading.브론즈2.Day4;

import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] A = scan.next().toCharArray();
        char[] B = scan.next().toCharArray();

        char temp = A[0];
        A[0] = A[2];
        A[2] = temp;

        temp = B[0];
        B[0] = B[2];
        B[2] = temp;

        int resA = Integer.parseInt(new String(A));
        int resB = Integer.parseInt(new String(B));

        System.out.println(Math.max(resA, resB));

    }
}
