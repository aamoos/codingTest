package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-12-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-28        김재성       최초 생성
 */
public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if(A > 0 && B > 0){
            System.out.println(1);
        }else if(A < 0 && B > 0){
            System.out.println(2);
        }else if(A < 0 && B < 0){
            System.out.println(3);
        }else if(A > 0 && B < 0){
            System.out.println(4);
        }
    }
}
