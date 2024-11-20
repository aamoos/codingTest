package com.codingTest.harucoading.브론즈2.Day18;

import java.util.Scanner;

public class BOJ10996 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0; i<2*N; i++){
            for(int j=0; j<N; j++){
                if((i+j)%2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
