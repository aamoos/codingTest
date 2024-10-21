package com.codingTest.harucoading.브론즈2.Day7;

import java.util.Scanner;

public class BOJ1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();

        if(B >= C){
            System.out.println(-1);
        }else{
            System.out.println(A/(C-B)+1);
        }
    }
}
