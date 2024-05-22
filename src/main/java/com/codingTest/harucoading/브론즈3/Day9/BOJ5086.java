package com.codingTest.harucoading.브론즈3.Day9;

import java.util.Scanner;

public class BOJ5086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int A = scan.nextInt();
            int B = scan.nextInt();
            if(A == 0 && B == 0){
                break;
            }

            if(B % A == 0){
                System.out.println("factor");
            }else if(A % B == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }

        }
    }
}
