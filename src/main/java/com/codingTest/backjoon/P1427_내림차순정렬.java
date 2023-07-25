package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P1427_내림차순정렬
 * author         : 김재성
 * date           : 2023-07-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-10        김재성       최초 생성
 */
public class P1427_내림차순정렬 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int A[] = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        //선택정렬
        for(int i=0; i<str.length(); i++){
            int max = i;
            for(int j = i+1; j<str.length(); j++){
                if(A[j] > A[max]){
                    max = j;
                }
            }
            if(A[i] < A[max]){
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }

        for(int i=0; i<str.length(); i++){
            System.out.print(A[i]);
        }
    }
}
