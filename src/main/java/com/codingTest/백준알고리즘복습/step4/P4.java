package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int answer = 0;
        for(int i=0; i<9; i++){
            int a = Integer.parseInt(br.readLine());
            if(a > max){
                max = a;
                answer = i;
            }
        }
        System.out.println(max);
        System.out.println(answer+1);
    }
}