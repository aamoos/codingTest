package com.codingTest.harucoading.브론즈1.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int P[] = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            P[i] = scan.nextInt();
            sum += P[i];
        }

        Arrays.sort(P);
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                // 9명의 합에서 7명이 아닌 나머지 2명의 키를 빼면 100이되요
                if(sum-P[i]-P[j] == 100){
                    for(int k=0; k<9; k++){
                        if(k!=i && k!=j){
                            System.out.println(P[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
