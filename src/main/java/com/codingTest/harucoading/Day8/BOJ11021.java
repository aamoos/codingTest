package com.codingTest.harucoading.Day8;

import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i=1; i<=T; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int sum = A+B;
            System.out.println("Case #"+i+": "+sum);
        }
    }
}