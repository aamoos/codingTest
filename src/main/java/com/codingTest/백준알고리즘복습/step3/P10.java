package com.codingTest.백준알고리즘복습.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String space = " ";
        String star = "*";
        for(int i=1; i<=N; i++){
            int spaceCount = N-i;
            int starCount = N-spaceCount;
            System.out.println(space.repeat(spaceCount)+star.repeat(starCount));
        }
    }
}
