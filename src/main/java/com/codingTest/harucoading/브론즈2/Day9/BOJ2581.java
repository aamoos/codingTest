package com.codingTest.harucoading.브론즈2.Day9;

import java.util.Scanner;

public class BOJ2581 {
    public static void main(String[] args) {
        int A[] = new int[10000];

        for(int i=0; i<10001; i++){
            A[i] = i;
        }

        //10000 이하의 소수 구하기
        //소수면 그 자리에 자기 값을 그대로 가지고 있고
        //아니면 0으로 변경 하는 방식
        for(int i=2; i<Math.sqrt(10001); i++){
            if(A[i] == i){
                //소수이면
                for(int j = i+1; j<10001; j=j+1){
                    A[j] = 0;
                }
            }
        }

        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        int sum = 0;
        int min = 0;

        for(int i=N; i>=M; i--){
            sum+= A[i];

            if(A[i] != 0){
                min = A[i];
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
