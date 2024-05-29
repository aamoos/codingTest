package com.codingTest.harucoading.브론즈3.Day16;

import java.util.Scanner;

public class BOJ2720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            int C = scan.nextInt();
            int Q, D, N, P;
            Q = C/25; C%=25;
            D = C/10; C%=10;
            N = C/5;  C%=5;
            P = C;
            System.out.println(Q+" "+D+" "+N+" "+P);
        }
    }
}
