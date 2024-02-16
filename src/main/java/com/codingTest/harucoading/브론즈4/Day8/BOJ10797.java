package com.codingTest.harucoading.브론즈4.Day8;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();
        int count = 0;
        for(int i=0; i<5; i++){
            if(check == scan.nextInt()){
                count++;
            }
        }
        System.out.println(count);
    }
}