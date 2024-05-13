package com.codingTest.harucoading.브론즈3.Day3;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        B += C;
        if(B > 59){
            A = (A + B/60)%24;
            B = B%60;
        }
        System.out.println(A+ " " + B);
    }
}