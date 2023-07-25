package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P2750_수정렬하기
 * author         : 김재성
 * date           : 2023-07-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-09        김재성       최초 생성
 */
public class P2750_수정렬하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scan.nextInt();
        }
        //버블 정렬을 구현하는 영역
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
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
