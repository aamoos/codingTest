package com.codingTest.harucoading.브론즈3.Day14;

import java.util.Scanner;

public class BOJ2455 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //역이 4개로 fix
        int Max = 0;
        int Now = 0;
        for(int i=0; i<4; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            Now = Now - A + B;
            Max = Math.max(Now, Max);
        }
        System.out.println(Max);
    }
}
