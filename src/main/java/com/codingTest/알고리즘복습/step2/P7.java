package com.codingTest.알고리즘복습.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int answer = 0;

        //같은눈 3개
        if(a==b && b==c && a==c){
            answer = 10000 + a * 1000;
        }else if(a!=b && b!=c && a!=c){
            //눈이 3개다 다를경우

            int max = 0;
            if(a > max){
                max = a;
            }
            if(b > max){
                max = b;
            }
            if(c > max){
                max = c;
            }
            answer = max * 100;
        }else{
            int same = 0;
            if(a==b){
                same = a;
            }else if(b==c){
                same = b;
            }else if(a==c){
                same = c;
            }
            answer = 1000 + same * 100;
        }
        System.out.println(answer);
    }
}
