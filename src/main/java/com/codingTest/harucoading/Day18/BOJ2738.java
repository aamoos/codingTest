package com.codingTest.harucoading.Day18;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int A[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] += scan.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}