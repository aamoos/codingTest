package com.codingTest.harucoading.Day15;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            int temp = scan.nextInt();
            sum += temp*temp;
        }

        System.out.println(sum%10);
    }
}