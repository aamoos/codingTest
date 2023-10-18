package com.codingTest.백준알고리즘복습.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘복습.step3
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-13        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0; i<=n; i++){
            result+=i;
        }
        System.out.println(result);
    }
}
