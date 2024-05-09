package com.codingTest.harucoading.브론즈3.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[3];
        A[0] = scan.nextInt();
        A[1] = scan.nextInt();
        A[2] = scan.nextInt();

        Arrays.sort(A);
        System.out.println(A[1]);
    }
}
