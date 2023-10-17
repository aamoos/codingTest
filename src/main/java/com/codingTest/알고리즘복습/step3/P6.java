package com.codingTest.알고리즘복습.step3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step3
 * fileName       : P6
 * author         : 김재성
 * date           : 2023-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-17        김재성       최초 생성
 */
public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long T = Long.parseLong(br.readLine());
        for(long i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            bw.write(A+B+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}