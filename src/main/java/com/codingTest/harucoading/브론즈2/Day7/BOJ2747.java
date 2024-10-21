package com.codingTest.harucoading.브론즈2.Day7;

import java.util.Scanner;

public class BOJ2747 {
    public static void main(String[] args) {
        int p[] = new int[46];
        p[0] = 0;
        p[1] = 1;

        for(int i=2; i<=45; i++){
            p[i] = p[i-1] + p[i-2];
        }

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(p[n]);
    }
}
