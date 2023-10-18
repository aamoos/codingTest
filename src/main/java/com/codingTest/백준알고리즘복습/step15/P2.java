package com.codingTest.백준알고리즘복습.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step15
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-16        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long answer = a * b / gcd(a, b);

        System.out.println(answer);
    }

    public static long gcd(long a, long b){
        while(b!=0){
           long r = a % b;
           a=b;
           b=r;
        }
        return a;
    }
}
