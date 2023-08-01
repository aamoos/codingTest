package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P10798_세로읽기
 * author         : 김재성
 * date           : 2023-08-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        김재성       최초 생성
 */
public class P10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        char[] c = br.readLine().toCharArray();
        char[] d = br.readLine().toCharArray();
        char[] e = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<15; i++){
            if(a.length > i){
                sb.append(a[i]);
            }if(b.length > i){
                sb.append(b[i]);
            }if(c.length > i){
                sb.append(c[i]);
            }if(d.length > i){
                sb.append(d[i]);
            }if(e.length > i){
                sb.append(e[i]);
            }
        }
        System.out.println(sb.toString());
    }
}