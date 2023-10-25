package com.codingTest.알고리즘.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘.step2
 * fileName       : P7
 * author         : 김재성
 * date           : 2023-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-25        김재성       최초 생성
 */
public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, cnt = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else{
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}