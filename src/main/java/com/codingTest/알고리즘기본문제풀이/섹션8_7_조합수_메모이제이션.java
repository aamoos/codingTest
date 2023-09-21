package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션8_7_조합수_메모이제이션 {
    static int[][] dy = new int[35][35];

    public static int DFS(int n, int r){

        //메모이제이션
        if(dy[n][r] > 0){
            return dy[n][r];
        }

        if(n == r || r == 0){
            return 1;
        }else{
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(DFS(n, r));
    }
}
