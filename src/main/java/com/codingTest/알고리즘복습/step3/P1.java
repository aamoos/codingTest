package com.codingTest.알고리즘복습.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
}
