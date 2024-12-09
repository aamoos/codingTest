package com.codingTest.harucoading.브론즈1.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        int Max = -1;
//        int Min = Integer.MAX_VALUE;
//        for(int i=0; i<n; i++){
//            int temp = scan.nextInt();
//
//            if(Max < temp){
//                Max = temp;
//            }
//            if(Min > temp){
//                Min = temp;
//            }
//        }
//        System.out.println(Max+Min);

        int A[] = new int[n];

        for(int i=0; i<n; i++){
            A[i] = scan.nextInt();
        }

        Arrays.sort(A);

        System.out.println(A[0] * A[A.length-1]);
    }
}
