package com.codingTest.harucoading.브론즈2.Day5;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 1;
        int now = 1;

        while(N > count){
            count += now * 6;
            now++;
        }
        System.out.println(now);
    }
}
