package com.codingTest.harucoading.브론즈1.Day2;

import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int C = A - B;
        int day = (V-B)/C;

        if((V-B)%C != 0){
            day++;
        }

        System.out.println(day);
    }
}
