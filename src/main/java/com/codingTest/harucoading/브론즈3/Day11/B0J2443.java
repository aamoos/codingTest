package com.codingTest.harucoading.브론즈3.Day11;

import java.util.Scanner;

public class B0J2443 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<2*N-1-i; j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}