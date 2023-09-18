package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션8_3_최대정수구하기
 * author         : 김재성
 * date           : 2023-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-18        김재성       최초 생성
 */
public class 섹션8_3_최대정수구하기 {

    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    public static void DFS(int L, int sum, int time, int[] ps, int[] pt){

        if(time>m){
            return;
        }
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        DFS(0,0,  0, a, b);
        System.out.println(answer);
    }
}
