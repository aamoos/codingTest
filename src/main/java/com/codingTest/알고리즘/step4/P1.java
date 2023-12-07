package com.codingTest.알고리즘.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char answer;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0));
            //x라는 key map에 있으면 va
        }

    }
}
