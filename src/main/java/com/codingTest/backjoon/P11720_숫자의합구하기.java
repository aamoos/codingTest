package com.codingTest.backjoon;

import java.util.Scanner;

public class P11720_숫자의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';       //정수형 변환
        }
        System.out.println(sum);
    }
}
