package com.codingTest.harucoading.브론즈4.Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%8 == 1){
            System.out.println(1);
        }else if(n%8 == 0 || n%8 == 2){
            System.out.println(2);
        }else if(n%8 == 3 || n%8 == 7){
            System.out.println(3);
        }else if(n%8 == 4 || n%8 == 6){
            System.out.println(4);
        }else{
            System.out.println(5);
        }
    }
}