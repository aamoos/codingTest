package com.codingTest.harucoading.브론즈1.Day5;

import java.util.Scanner;

public class BOJ2748 {
    public static void main(String[] args) {
        long F[] = new long[91];
        F[0] = 0;
        F[1] = 1;

        for(int i=2; i<=90; i++){
            F[i] = F[i-2] + F[i-1];
        }

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(F[n]);
    }
}
