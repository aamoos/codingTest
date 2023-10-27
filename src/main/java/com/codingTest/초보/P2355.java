package com.codingTest.초보;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.초보
 * fileName       : P2355
 * author         : 김재성
 * date           : 2023-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-27        김재성       최초 생성
 */
public class P2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        //큰수와 작은수를 A와 B에 저장
        long A = Math.min(N, M);
        long B = Math.max(N, M);
        long sum = (((B+1) * B) / 2) - (((A-1) * A) / 2);

        System.out.println(sum);
    }
}