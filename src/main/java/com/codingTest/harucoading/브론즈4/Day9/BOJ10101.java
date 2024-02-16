package com.codingTest.harucoading.브론즈4.Day9;

import java.util.Scanner;

public class BOJ10101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if(A==60 && B==60 && C==60){
            System.out.println("Equilateral");
        }else if( (A+B+C == 180) && (A==B || B==C || C==A) ){
            System.out.println("Isosceles");
        }else if( (A+B+C == 180) && (A!=B && B!=C && C!=A) ){
            System.out.println("Scalene");
        }else if(A+B+C != 180){
            System.out.println("Error");
        }
    }
}