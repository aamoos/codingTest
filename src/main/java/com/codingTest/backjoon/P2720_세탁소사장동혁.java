package com.codingTest.backjoon;

import java.util.Scanner;

public class P2720_세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            int C = scan.nextInt();
            int a = C/25;
            C = C%25;

            int b = C/10;
            C = C%10;

            int c = C/5;
            C = C%5;

            int d = C/1;
            C = C%1;

            System.out.println(a+" "+b+" "+c+" "+d);
        }
    }
}
