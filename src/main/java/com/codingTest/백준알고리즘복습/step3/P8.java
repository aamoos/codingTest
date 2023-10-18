package com.codingTest.백준알고리즘복습.step3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step3
 * fileName       : P8
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+A+" + "+B+" = "+(A+B)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
