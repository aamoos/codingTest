package com.codingTest.harucoading.브론즈4.Day3;

import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //3개의눈이 같음
        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }else if( a==b || b==c || c==a){
            //같은눈이 2개인경우
            if(a==b){
                System.out.println(1000+a*100);
            }else{
                System.out.println(1000+c*100);
            }
        }else{
            int max = Math.max(a,Math.max(b,c));
            System.out.println(max*100);
        }
    }
}