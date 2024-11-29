package com.codingTest.harucoading.브론즈2.Day20;

import java.util.Scanner;

public class BOJ3040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int A[] = new int[9];
        for(int i=0; i<9; i++){
            A[i] = scan.nextInt();
            sum += A[i];
        }

        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum-A[i]-A[j] == 100){   // 두 난장이가 범인일때
                    for(int k=0; k<9; k++){
                        if(k!=i && k!=j){
                            System.out.println(A[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
