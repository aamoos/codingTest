package com.codingTest.harucoading.브론즈4.Day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[3];
        //Integer A[] = new Integer[3];
        A[0] = scan.nextInt();
        A[1] = scan.nextInt();
        A[2] = scan.nextInt();
        Arrays.sort(A);                               //오름차순
        //Arrays.sort(A, Collections.reverseOrder()); //내림차순
        System.out.println(A[0]+" "+A[1]+" "+A[2]);
    }
}