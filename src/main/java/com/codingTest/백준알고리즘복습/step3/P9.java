package com.codingTest.백준알고리즘복습.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step3
 * fileName       : P9
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String s = "";

        for(int i=0; i<N; i++){
            s+="*";
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
