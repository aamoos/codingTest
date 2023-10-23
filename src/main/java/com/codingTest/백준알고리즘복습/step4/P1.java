package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step4
 * fileName       : P1
 * author         : 김재성
 * date           : 2023-10-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-23        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int answer = 0;

        for (String s : arr) {
            int a = Integer.parseInt(s);
            if(a == target){
                answer++;
            }
        }
        System.out.println(answer);
    }
}