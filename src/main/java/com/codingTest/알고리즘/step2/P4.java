package com.codingTest.알고리즘.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘.step2
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-25        김재성       최초 생성
 */
public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<n; i++){
            answer[i] = answer[i-2]+answer[i-1];
        }

        for (int i : answer) {
            System.out.print(i+" ");
        }

    }
}
