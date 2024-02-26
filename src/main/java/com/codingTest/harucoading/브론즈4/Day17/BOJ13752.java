package com.codingTest.harucoading.브론즈4.Day17;

import java.util.Scanner;

public class BOJ13752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            int k = scan.nextInt();
            for(int j=0; j<k; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}