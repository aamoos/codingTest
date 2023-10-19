package com.codingTest.백준알고리즘복습.step15;

import java.io.*;

public class P9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;  //창문이 열려있는 개수
        //제곱수만 count
        for(int i=1; i * i <= N; i++){
            count++;
        }
        System.out.println(count);
    }
}
