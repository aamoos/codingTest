package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long V = Long.parseLong(st.nextToken());

        long destination = V - B;
        long dist = A - B;

        long div = destination / dist;
        long mod = destination % dist;

        long day = div;

        if(mod != 0) {
            day = day + 1;
        }
        System.out.println(day);

    }
}
