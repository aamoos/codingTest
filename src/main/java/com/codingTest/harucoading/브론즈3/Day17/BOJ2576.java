package com.codingTest.harucoading.브론즈3.Day17;

import java.util.Scanner;

public class BOJ2576 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<7; i++){
            int temp = scan.nextInt();

            if(temp % 2 != 0){
                sum+=temp;
                if(min > temp){
                    min = temp;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
