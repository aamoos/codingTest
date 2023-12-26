package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-12-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-26        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";

        if(N >= 90 && N <= 100){
            result = "A";
        }else if(N >= 80 && N <= 89){
            result = "B";
        }else if(N >= 70 && N <= 79){
            result = "C";
        }else if(N >= 60 && N <= 69){
            result = "D";
        }else{
            result = "F";
        }
        System.out.println(result);
    }
}
