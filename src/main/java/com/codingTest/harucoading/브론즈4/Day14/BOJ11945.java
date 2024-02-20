package com.codingTest.harucoading.브론즈4.Day14;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        if(M>0){
            for(int i=0; i<N; i++){
                char[] text = scan.next().toCharArray();
                for(int j = M-1; j>=0; j--){
                    System.out.print(text[j]);
                }
                System.out.println();
            }
        }
    }
}