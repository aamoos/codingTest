package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P11050_이항계수구하기1
 * author         : 김재성
 * date           : 2023-08-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-08        김재성       최초 생성
 */
public class P11050_이항계수구하기1 {
    static int N, K;
    static int D[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        D = new int[N+1][N+1];
        // 초기화
        for(int i=0; i<=N; i++){
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }

        // 점화식으로 배열 완성하기
        for(int i=2; i<=N; i++){
            for(int j=1; j<i; j++){
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }
        System.out.println(D[N][K]);
    }
}
