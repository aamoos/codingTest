package com.codingTest.book2024;

import java.util.Scanner;

public class P1929_소수구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] A = new int[N+1];

        for(int i=1; i<=N; i++){
            A[i] = i;
        }

        for(int i=2; i<=Math.sqrt(N); i++){
            if(A[i] == 0){
                continue;
            }

            for(int j=i+i; j<=N; j=j+1){
                A[j] = 0;
            }
        }

        for(int i = M; i<=N; i++){
            if(A[i] != 0){
                System.out.println(A[i]);
            }
        }
    }
}
