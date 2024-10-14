package com.codingTest.harucoading.브론즈2.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scan.nextInt();
        }

        //자바에서 제공해주는 소팅 nlogn 시간복잡도
//        Arrays.sort(A);

        //버블정렬
        for(int i=1; i<N; i++){
            for(int j=0; j<N-i; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }

        }

        for(int i=0; i<N; i++){
            System.out.println(A[i]);
        }
    }
}
