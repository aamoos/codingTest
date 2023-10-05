package com.codingTest.알고리즘복습.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        List<Integer> list = new ArrayList<>();

        for(int i=b.length()-1; i>=0; i--){
            int target = Integer.parseInt(String.valueOf(b.charAt(i)));
            list.add(a*target);
        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(0) + (list.get(1)*10) + (list.get(2)*100));
    }
}
