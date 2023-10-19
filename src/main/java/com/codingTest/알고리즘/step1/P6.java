package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            String a = String.valueOf(c);
            if(!list.contains(a)){
                list.add(a);
            }
        }

        for (String b : list) {
            sb.append(b);
        }
        System.out.println(sb.toString());
    }
}