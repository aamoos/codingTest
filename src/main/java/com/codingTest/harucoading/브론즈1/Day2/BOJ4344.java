package com.codingTest.harucoading.브론즈1.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int S = 0;
            int P[] = new int[N];

            for(int j=0; j<N; j++){
                P[j] = Integer.parseInt(st.nextToken());
                S+= P[j];
            }
            double avg = S/ (double) N;
            int over_avg = 0;
            for(int k=0; k<N; k++){
                if(avg < P[k]){
                    over_avg++;
                }
            }
            System.out.println(Math.round(over_avg/(double)N*100*1000)/1000.0 + "%");
        }
    }
}
