package com.codingTest.백준알고리즘복습.step3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step3
 * fileName       : P7
 * author         : 김재성
 * date           : 2023-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-17        김재성       최초 생성
 */
public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=1; i<=T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+(A+B)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
