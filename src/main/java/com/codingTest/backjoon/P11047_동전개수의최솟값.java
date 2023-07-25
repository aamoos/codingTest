package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P11047_동전개수의최솟값
 * author         : 김재성
 * date           : 2023-07-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-19        김재성       최초 생성
 */
public class P11047_동전개수의최솟값 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int A[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scan.nextInt();
        }

        //그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for(int i = N-1; i>=0; i--){
            if(A[i] <= K){
                count += (K/A[i]);
                K = K % A[i];
            }
        }
        System.out.println(count);
    }
}
