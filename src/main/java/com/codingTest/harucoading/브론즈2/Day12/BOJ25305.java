package com.codingTest.harucoading.브론즈2.Day12;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ25305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int [] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = scan.nextInt();
        }

        Arrays.sort(A);
        System.out.println(A.length-k);
    }
}
