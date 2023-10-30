package com.codingTest.알고리즘.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘.step3
 * fileName       : P5
 * author         : 김재성
 * date           : 2023-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-30        김재성       최초 생성
 */
public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer=0, sum=0, lt=0;
        int m = n/2+1;
        int[] arr = new int[m];

        for(int i=0; i<m; i++){
            arr[i] = i+1;
        }

        for(int rt=0; rt<m; rt++){
            sum+=arr[rt];

            if(sum == n){
                answer++;
            }

            while(sum > n){
                sum-=arr[lt++];
                if(sum == n){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}