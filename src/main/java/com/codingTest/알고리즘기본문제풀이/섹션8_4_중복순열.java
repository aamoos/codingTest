package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션8_4_중복순열
 * author         : 김재성
 * date           : 2023-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-18        김재성       최초 생성
 */

public class 섹션8_4_중복순열 {

    static int[] pm;
    static int n, m;

    public static void DFS(int L){
        if(L == m){
            for(int x : pm){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pm = new int[m];
        DFS(0);
    }

}
