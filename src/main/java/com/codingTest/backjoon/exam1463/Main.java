package com.codingTest.backjoon.exam1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recur(N, 0));
    }

    public static int recur(int N, int count){

        //N이 2미만인 경우 누적된 count값을 반환
        if(N < 2){
            return count;
        }
        return Math.min(recur(N/2, count + 1 + (N%2)), recur(N/3, count+1+(N%3)));
    }
}
