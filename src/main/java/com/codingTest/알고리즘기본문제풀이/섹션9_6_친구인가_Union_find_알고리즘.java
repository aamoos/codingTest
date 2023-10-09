package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션9_6_친구인가_Union_find_알고리즘 {

    static int[] unf;
    public static int Find(int v){
        if(v == unf[v]){
            return v;
        }else{
            return unf[v] = Find(unf[v]);
        }
    }

    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb){
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        unf = new int[n+1];
        for(int i=1; i<=n; i++){
            unf[i] = i;
        }

        for(int i=1; i<=m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            Union(a, b);
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int fa = Find(a);
    }
}
