package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for (char x : str.toCharArray()) {
           if(Character.isDigit(x)){
               answer+=x;
           }
        }
        System.out.println(Integer.parseInt(answer));
    }
}
