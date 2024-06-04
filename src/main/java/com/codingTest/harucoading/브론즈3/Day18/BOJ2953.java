package com.codingTest.harucoading.브론즈3.Day18;

import java.util.Scanner;

public class BOJ2953 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Max = Integer.MIN_VALUE;
        int Max_num = 0;
        for(int i=1; i<=5; i++){
            int temp_sum = 0;
            for(int j=0; j<4; j++){
                temp_sum += scan.nextInt();
            }
            if(Max < temp_sum){
                Max = temp_sum;
                Max_num = i;
            }
        }
        System.out.println(Max_num+" "+Max);
    }
}
