package com.codingTest.harucoading.Day13;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,2,8};
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<6; i++){
            int temp = scan.nextInt();
            int result = A[i] - temp;
            System.out.print(result + " ");
        }
    }
}