package com.codingTest.harucoading.브론즈3.Day4;

import java.util.Scanner;

public class BOJ10520 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++){
            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();

            int Y = N%H;
            int X = N/H;

            //꼭대기층이면
            if(Y == 0){
                if(X < 10){
                    System.out.println(H+"0"+X);
                }else{
                    System.out.println(H+X);
                }
            }else{
                X++;
                if(X < 10){
                    System.out.println(Y+"0"+X);
                }else{
                    System.out.println(Y+X);
                }
            }
        }
    }
}
