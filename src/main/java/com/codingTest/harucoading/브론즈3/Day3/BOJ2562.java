package com.codingTest.harucoading.브론즈3.Day3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i=1; i<10; i++){
            int temp = scan.nextInt();
            if(temp > max){
                max = temp;
                max_index = i;
            }
        }
        System.out.println(max);
        System.out.println(max_index);
    }
}
