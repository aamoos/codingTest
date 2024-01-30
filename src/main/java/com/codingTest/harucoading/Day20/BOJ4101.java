package com.codingTest.harucoading.Day20;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int N = scan.nextInt();
            int M = scan.nextInt();

            if(N == 0 && M == 0){
                break;
            }else if(N>M){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}