package com.codingTest.harucoading.브론즈3.Day1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        char[] second = scan.next().toCharArray();
        int sum = 0;
        int su = 1;
        for(int i=2; i>=0; i--){
            int temp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first*temp);
            sum+= (first*temp)*su;
            su = su * 10;
        }
        System.out.println(sum);
    }
}
