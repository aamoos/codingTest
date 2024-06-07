package com.codingTest.harucoading.브론즈3.Day20;

import java.util.Scanner;

public class BOJ2903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = 3;
        for(int i=2; i<=N; i++){
            num = num * 2 - 1;  //n번째 한번의 길이는 => N-1번째 한변의 점의 갯수 * 2 -1
        }
        System.out.println(num*num);
    }
}