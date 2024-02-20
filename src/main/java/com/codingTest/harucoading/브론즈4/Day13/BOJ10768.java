package com.codingTest.harucoading.브론즈4.Day13;

import java.util.Scanner;

public class BOJ10768 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int D = scan.nextInt();

        if(M < 2){
            System.out.println("Before");
        }else if(M>2){
            System.out.println("After");
        }else{
            if(D<18){
                System.out.println("Before");
            }else if(D>18){
                System.out.println("After");
            }else{
                System.out.println("Special");
            }
        }
    }
}