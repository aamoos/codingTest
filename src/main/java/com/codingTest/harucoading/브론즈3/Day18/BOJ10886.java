package com.codingTest.harucoading.브론즈3.Day18;

import java.util.Scanner;

public class BOJ10886 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            int temp = scan.nextInt();
            if(temp == 1){
                count++;
            }
        }

        if(count>N/2){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }

    }
}
