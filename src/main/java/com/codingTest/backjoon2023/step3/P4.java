package com.codingTest.backjoon2023.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int result = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            result+=(price*count);
        }

        if(total == result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}