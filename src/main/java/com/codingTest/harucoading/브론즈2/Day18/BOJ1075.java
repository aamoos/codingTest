package com.codingTest.harucoading.브론즈2.Day18;

import java.util.Scanner;

public class BOJ1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();

        N = N/100;  // 1234 => 12
        N = N*100;  // 12 => 1200

        while(true){
            if(N%F == 0){
                break;
            }
            N++;
        }
        char[] A = String.valueOf(N).toCharArray();
        System.out.print(A[A.length-2]);
        System.out.print(A[A.length-1]);
    }
}
