package com.codingTest.harucoading.브론즈3.Day7;

import java.util.Scanner;

public class BOJ2442 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<N+i; j++){
                if(N-i-j<=1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
