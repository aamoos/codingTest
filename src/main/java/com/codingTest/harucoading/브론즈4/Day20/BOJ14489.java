package com.codingTest.harucoading.브론즈4.Day20;

import java.util.Scanner;

public class BOJ14489 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        if(A+B >= C*2){
            System.out.println((A+B)-(C*2));
        }else{
            System.out.println((A+B));
        }
    }
}