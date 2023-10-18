package com.codingTest.백준알고리즘복습.step11;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step11
 * fileName       : P7
 * author         : 김재성
 * date           : 2023-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-13        김재성       최초 생성
 */
public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();

        if(a1*n0+a0 <= c*n0 && c>=a1){
            bw.write("1");
        }else{
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}
