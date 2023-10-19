package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        String answer = "";
        int maxLength = 0;
        for (String s : list) {
            if(s.length() > maxLength){
                answer = s;
                maxLength = s.length();
            }
        }
        System.out.println(answer);
    }
}
