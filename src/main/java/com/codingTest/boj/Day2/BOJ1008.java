package com.codingTest.boj.Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = Double.parseDouble(scan.next());
        double B = Double.parseDouble(scan.next());
        System.out.println(A/B);
        // float double => 정밀도
        // float => 소수점 6~7자리
        // double => 소수점 15~16자리 정도까지 표현이 가능

        //TODO 코딩테스트에서는 왠만하면 float보다는 double쓰는게 더 좋다.
    }
}
