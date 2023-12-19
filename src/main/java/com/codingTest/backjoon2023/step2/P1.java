package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P1
 * author         : 김재성
 * date           : 2023-12-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-19        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A < B){
            System.out.println("<");
        }else if(A > B){
            System.out.println(">");
        }else{
            System.out.println("==");
        }
    }
}