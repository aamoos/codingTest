package com.codingTest.backjoon.exam15372;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        for(int i = 0; i < t; i++) {

            int a = Integer.parseInt(br.readLine());

            Long b = (long)Math.pow(a,2);

            bw.write( b + "\n");

        }
        bw.flush();

    }
}
