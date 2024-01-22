package com.codingTest.harucoading.Day7;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();

        for(int i=0; i<N; i++){
            int temp = scan.nextInt();

            if(temp < X){
                System.out.print(temp+" ");
            }
        }
    }
}