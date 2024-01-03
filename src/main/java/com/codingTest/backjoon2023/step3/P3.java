package com.codingTest.backjoon2023.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<=N; i++){
            result+=i;
        }
        System.out.println(result);
    }
}