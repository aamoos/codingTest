package com.codingTest.harucoading.브론즈3.Day9;

import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<2*N-1-i; j++){
                if(i<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1; i<N; i++){
            for(int j=0; j<N+i; j++){
                if(i+j>=N-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
