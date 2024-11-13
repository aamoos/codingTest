package com.codingTest.harucoading.브론즈3.Day2;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            int temp = scan.nextInt();
            if(temp > max){
                max = temp;
            }

            if(temp < min){
                min = temp;
            }
        }
        System.out.println(min + " " + max);
    }
}