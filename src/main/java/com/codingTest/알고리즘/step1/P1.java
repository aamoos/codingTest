package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘.step1
 * fileName       : P1
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toLowerCase();
        char b = br.readLine().toLowerCase().charAt(0);
        System.out.println(solution(a, b));
    }

    public static int solution(String s, char b){
        int answer = 0;

        for (char c : s.toCharArray()) {
            if(c == b){
                answer++;
            }
        }
        return answer;
    }
}