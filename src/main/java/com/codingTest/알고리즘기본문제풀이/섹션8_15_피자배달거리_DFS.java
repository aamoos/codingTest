package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션8_15_피자배달거리_DFS
 * author         : 김재성
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        김재성       최초 생성
 */
public class 섹션8_15_피자배달거리_DFS {

    public static class Point{
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pz, hs;

    public void DFS(int L, int s){
        if(L==m){
            for(int x : combi){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=s; i<len; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = scan.nextInt();
            }
        }
    }
}
