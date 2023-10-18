package com.codingTest.백준알고리즘복습.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * packageName    : com.codingTest.알고리즘복습.step15
 * fileName       : P5
 * author         : 김재성
 * date           : 2023-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-17        김재성       최초 생성
 */
public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            long num = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(num));

            if(bi.isProbablePrime(10)){
                //소수인지 판별
                System.out.println(num);
            }else{
                //입력값보다 큰 바로 다음소수
                System.out.println(bi.nextProbablePrime());
            }
        }
    }
}
