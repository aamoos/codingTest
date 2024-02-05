package com.codingTest.harucoading.브론즈4.Day4;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            int ta = sc.nextInt();
            int tn = sc.nextInt();
            sum += ta*tn;
        }

        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}