package com.codingTest.harucoading.브론즈3.Day5;

import java.util.Scanner;

public class BOJ2441 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
