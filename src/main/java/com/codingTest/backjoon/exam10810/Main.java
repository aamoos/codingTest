package com.codingTest.backjoon.exam10810;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon.exam10810
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j=I-1; j<J; j++){
                arr[j] = K;
            }
        }
        for(int k=0; k<arr.length; k++){
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
