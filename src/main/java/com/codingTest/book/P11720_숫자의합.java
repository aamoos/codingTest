package com.codingTest.book;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String sNum = scan.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i<cNum.length; i++){
            sum+= cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
