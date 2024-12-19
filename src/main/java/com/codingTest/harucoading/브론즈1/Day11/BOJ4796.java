package com.codingTest.harucoading.브론즈1.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L==0 && P==0 && V==0){
                break;
            }
            int day = V/P*L;
            day += Math.min(L, V%P);
            cnt++;
            System.out.println("Case "+cnt+": "+day);
        }
    }
}
