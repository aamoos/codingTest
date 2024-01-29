package com.codingTest.harucoading.Day16;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        int A[] = new int[31];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<28; i++){
            int number = scan.nextInt();
            A[number]++;
        }

        for(int i=1; i<=30; i++){
            if(A[i] == 0){
                System.out.println(i);
            }
        }
    }
}