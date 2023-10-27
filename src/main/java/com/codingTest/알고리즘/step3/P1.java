package com.codingTest.알고리즘.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘.step3
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-27        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken()) ;
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while(p1<n && p2<m){
            if(a[p1] < b[p2]){
                answer.add(a[p1++]);
            }else{
                answer.add(b[p2++]);
            }
        }

        while(p1<n){
            answer.add(a[p1++]);
        }

        while(p2<m){
            answer.add(b[p2++]);
        }

        for (Integer i : answer) {
            System.out.print(i+" ");
        }
    }
}
