package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-12-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-26        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        if(N % 4 == 0 && (N % 100 != 0 || N % 400 == 0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}