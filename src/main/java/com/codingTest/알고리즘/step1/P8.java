package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8 {
    public static void main(String[] args) throws IOException {
        String answer = "NO";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");  //A~Z까지의 문자가 아니면 ^(부정)
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            answer = "YES";
        }
        System.out.println(answer);
    }
}
