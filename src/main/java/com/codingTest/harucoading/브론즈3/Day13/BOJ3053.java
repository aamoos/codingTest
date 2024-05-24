package com.codingTest.harucoading.브론즈3.Day13;

import java.util.Scanner;

public class BOJ3053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        System.out.println(Math.PI*R*R);  //유클리드 기하학 파이 zOR제곱
        System.out.println(2*R*R); //택시 기하학 2 * R 제곱
    }
}
