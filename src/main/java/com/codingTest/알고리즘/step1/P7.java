package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        int lt = 0;
        int rt = s.length()-1;
        char[] c = s.toCharArray();
        String answer = "YES";

        while(lt < rt){
            if(c[lt] != c[rt]){
                answer = "NO";
            }
            lt++;
            rt--;
        }
        System.out.println(answer);
    }
}
