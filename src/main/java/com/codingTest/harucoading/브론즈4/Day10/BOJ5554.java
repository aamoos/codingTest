package com.codingTest.harucoading.브론즈4.Day10;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        for(int i=0; i<4; i++){
            s+= scan.nextInt();
        }

        System.out.println(s/60);
        System.out.println(s%60);
    }
}