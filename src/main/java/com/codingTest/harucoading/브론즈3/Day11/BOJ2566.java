package com.codingTest.harucoading.브론즈3.Day11;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[][] A = new int[10][10];

        int max = -1;
        int max_row = 0;
        int max_col = 1;
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                int temp = scan.nextInt();
                if(temp > max){
                    max = temp;
                    max_row = i;
                    max_col = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(max_row+" "+max_col);
    }
}
