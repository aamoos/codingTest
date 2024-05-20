package com.codingTest.harucoading.브론즈3.Day10;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        for(int i=0; i<N; i++){
            String[] text = scan.nextLine().split(",");
            int A = Integer.parseInt(text[0]);
            int B = Integer.parseInt(text[1]);
            System.out.println(A+B);
        }
    }
}
