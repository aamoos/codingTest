package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P1929_소수구하기
 * author         : 김재성
 * date           : 2023-07-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-19        김재성       최초 생성
 */
public class P1929_소수구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] A = new int[N+1];
        for(int i=1; i<=N; i++){
            A[i] = i;
        }

        for(int i=2; i<=Math.sqrt(N); i++){
            if(A[i] == 0) continue;
            for(int j=i+i; j<=N; j=j+i){
                A[j] = 0;
            }
        }

        for(int i=M; i<=N; i++){
            //소수일때만
            if(A[i] != 0){
                System.out.println(A[i]);
            }
        }
    }
}