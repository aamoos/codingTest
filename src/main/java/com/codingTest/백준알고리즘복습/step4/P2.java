package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step4
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-23        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            int c = Integer.parseInt(st.nextToken());
            if(b > c){
                System.out.print(c+" ");
            }
        }
    }
}