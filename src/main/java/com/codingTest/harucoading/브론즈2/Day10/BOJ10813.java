package com.codingTest.harucoading.브론즈2.Day10;

import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int A[] = new int[N+1];

        for(int i=1; i<=N; i++){
            A[i] = i;
        }

        for(int i=0; i<M; i++){
            int S = scan.nextInt();
            int E = scan.nextInt();
            int temp = A[S];
            A[S] = A[E];
            A[E] = temp;
        }

        for(int i=1; i<=N; i++){
            System.out.print(A[i]+" ");
        }
    }
}
