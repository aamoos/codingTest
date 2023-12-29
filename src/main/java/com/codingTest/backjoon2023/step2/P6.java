package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P6
 * author         : 김재성
 * date           : 2023-12-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-29        김재성       최초 생성
 */
public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}