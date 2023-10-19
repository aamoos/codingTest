package com.codingTest.백준알고리즘복습.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 1;
        for(int i=0; i<N; i++){
            answer*=2;
        }
        System.out.println(answer);
    }
}
