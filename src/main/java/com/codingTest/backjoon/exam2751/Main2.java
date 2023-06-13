package com.codingTest.backjoon.exam2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon.exam2750
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        김재성       최초 생성
 */
public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr= new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]){
                sb.append((i - 1000000)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
