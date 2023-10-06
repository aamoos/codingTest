package com.codingTest.알고리즘복습.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘복습.step12
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<N; i++){
            int number = i;

            if(i==198){

            }

            int sum = 0;        //각 자릿수 합 변수

            while(number != 0){
                sum = sum+ number % 10;
                number = number / 10;
            }

            if(sum+i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
