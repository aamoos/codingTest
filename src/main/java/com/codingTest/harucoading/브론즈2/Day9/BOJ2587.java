package com.codingTest.harucoading.브론즈2.Day9;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int A[] = new int[5];

        for(int i=0; i<5; i++){
            A[i] = scan.nextInt();
            sum += A[i];
        }

        System.out.println(sum/5);
        Arrays.sort(A);
        System.out.println(A[2]);
    }
}
