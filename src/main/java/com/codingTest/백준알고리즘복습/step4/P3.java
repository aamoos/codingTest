package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step4
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-25        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());
        int max = target;
        int min = target;
        for(int i=1; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a>max){
                max = a;
            }

            if(a<min){
                min = a;
            }
        }
        System.out.print(min+" "+max);
    }
}