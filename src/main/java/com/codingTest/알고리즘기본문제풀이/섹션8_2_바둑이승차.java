package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션8_2_바둑이승차
 * author         : 김재성
 * date           : 2023-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-18        김재성       최초 생성
 */
public class 섹션8_2_바둑이승차 {

    static int answer = Integer.MIN_VALUE, c, n;

    public static void DFS(int L, int sum, int[] arr){
        if(sum > c){
            return;
        }

        if(L == n){
            answer=Math.max(answer, sum);

        }else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
