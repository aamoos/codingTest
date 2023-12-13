package com.codingTest.backjoon2023.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon2023.step1
 * fileName       : P10
 * author         : 김재성
 * date           : 2023-12-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-13        김재성       최초 생성
 */
public class P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int b = Integer.parseInt(s);

        for(int i=s.length()-1; i>=0; i--){
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            System.out.println(a*n);
        }
        System.out.println(a*b);
    }
}
