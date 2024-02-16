package com.codingTest.harucoading.브론즈4.Day9;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int M = scan.nextInt();
        int result = K*N-M;

        if(result < 0){
            result = 0;
        }
        System.out.println(result);
    }
}