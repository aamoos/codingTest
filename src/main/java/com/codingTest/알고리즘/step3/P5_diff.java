package com.codingTest.알고리즘.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5_diff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n = n-cnt;
            if(n%cnt == 0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
