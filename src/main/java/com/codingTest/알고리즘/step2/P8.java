package com.codingTest.알고리즘.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[n];
        for(int i=0; i<n; i++){
           int cnt = 1;
           for(int j=0; j<n; j++){
               if(arr[j] > arr[i]){
                   cnt++;
               }
               answer[i] = cnt;
           }
        }

        for (int i : answer) {
            System.out.print(i+" ");
        }
    }
}
