package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P10988_팰린드롬인지확인하기
 * author         : 김재성
 * date           : 2023-08-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        김재성       최초 생성
 */
public class P10988_팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        String reverseStr = sb.reverse().toString();

        //원래 문자열과 뒤집은 문자열이 같은경우
        if(s.equals(reverseStr)){
            result = 1;
        }
        System.out.print(result);
    }
}
