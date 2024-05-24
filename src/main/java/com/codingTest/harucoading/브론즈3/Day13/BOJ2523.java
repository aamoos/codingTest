package com.codingTest.harucoading.브론즈3.Day13;

import java.util.Scanner;

public class BOJ2523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=1; i<=2*N-1; i++){
            for(int j=0; j<N; j++){
                if(i<=N && j<i || i>N && j+i<2*N){
                    System.out.print("*");
                }else{
                    break;
                }
            }
            System.out.println();
        }
    }
}