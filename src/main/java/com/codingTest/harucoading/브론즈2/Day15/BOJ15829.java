package com.codingTest.harucoading.브론즈2.Day15;

import java.util.Scanner;

public class BOJ15829 {
    public static void main(String[] args) {
        int r = 31;
        int M = 1234567891;

        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        char[] text = scan.next().toCharArray();

        long sum = 0;
        for(int i=0; i<L; i++){
            long V = text[i] - 'a' + 1;
            long a = 1;
            for(int j=0; j<i; i++){
                a = (a*r) % M;
            }

            long temp = (V*a) % M;
            sum += temp;
            sum %=M;
        }
        System.out.println(sum%M);
    }
}
