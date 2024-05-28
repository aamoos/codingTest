package com.codingTest.harucoading.브론즈3.Day15;

import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        if(T%10 != 0){
            // A, B, C 3개의 버튼으로 정확하게 맞출수 없음
            System.out.println(-1);
        }else{
            int A = T/300;  T = T%300;
            int B = T/60;   T = T%60;
            int C = T/10;
            System.out.println(A+" "+B+" "+C);
        }
    }
}
