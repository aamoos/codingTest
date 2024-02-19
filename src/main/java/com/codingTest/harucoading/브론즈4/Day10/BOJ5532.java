package com.codingTest.harucoading.브론즈4.Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int spend_A = A/C;
        if(A%C != 0){
            spend_A++;
        }

        int spend_B = B/D;
        if(B%D != 0){
            spend_B++;
        }
        System.out.println(L-Math.max(spend_A, spend_B));
    }
}