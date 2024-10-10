package com.codingTest.harucoading.브론즈2.Day3;

import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int result = A * B * C;

        char[] arr = Integer.toString(result).toCharArray();

        int[] count = new int[10];

        for(int i=0; i<arr.length; i++){
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            count[temp]++;
        }

        for(int i=0; i<10; i++){
            System.out.println(count[i]);
        }

    }
}
