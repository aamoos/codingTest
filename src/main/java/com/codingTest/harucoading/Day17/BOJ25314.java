package com.codingTest.harucoading.Day17;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int repeat = N/4;

        for(int i=0; i<repeat; i++){
            System.out.print("long ");
        }
        System.out.print("int");

    }
}