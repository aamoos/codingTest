package com.codingTest.백준알고리즘복습.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step3
 * fileName       : P12
 * author         : 김재성
 * date           : 2023-10-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-20        김재성       최초 생성
 */
public class P12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringTokenizer st;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }
    }
}
