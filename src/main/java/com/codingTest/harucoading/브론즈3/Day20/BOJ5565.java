package com.codingTest.harucoading.브론즈3.Day20;

import java.util.Scanner;

public class BOJ5565 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        for(int i=0; i<9; i++){
            total -= scan.nextInt();
        }
        System.out.println(total);
    }
}