package com.codingTest.harucoading.Day14;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[201];
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            int index = scan.nextInt();
            A[index+100]++;
        }
        int V = scan.nextInt();
        System.out.println(A[V+100]);
    }
}