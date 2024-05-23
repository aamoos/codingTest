package com.codingTest.harucoading.브론즈3.Day12;

import java.util.Scanner;

public class BOJ2501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int count = 0;
        boolean find = false;
        int result = 0;
        for(int i=1; i<=N; i++){
            if(N%i == 0){
                count++;
            }

            if(K == count){
                find = true;
                result = i;
                break;
            }
        }

        if(find){
            System.out.println(result);
        }else{
            System.out.println(0);
        }
    }
}
