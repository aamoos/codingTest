package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";

        String s = br.readLine();
        char[] c = s.toCharArray();
        int lt = 0, rt = s.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        System.out.println(answer);
    }
}