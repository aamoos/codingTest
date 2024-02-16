package com.codingTest.harucoading.브론즈4.Day9;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int P = scan.nextInt();

        for(int i=0; i<5; i++){
            int temp = scan.nextInt();
            System.out.print( (temp - L * P)+ " ");
        }
    }
}