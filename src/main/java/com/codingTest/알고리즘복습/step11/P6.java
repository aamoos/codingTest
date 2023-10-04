package com.codingTest.알고리즘복습.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step11
 * fileName       : P6
 * author         : 김재성
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        김재성       최초 생성
 */
public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine()) - 2;

        System.out.println(((n * n * n) + (3 * n * n) + (2 * n) ) / 6);
        System.out.println(3);
    }
}