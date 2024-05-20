package com.codingTest.harucoading.브론즈3.Day10;

import java.util.Scanner;

public class BOJ10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] B = new int[N+1];
        for(int t=0; t<M; t++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();

            for(int index = i; index <= j; index++){
                B[index] = k;
            }
        }
        for(int i=1; i<=N; i++){
            System.out.print(B[i]+ " ");
        }

    }
}
