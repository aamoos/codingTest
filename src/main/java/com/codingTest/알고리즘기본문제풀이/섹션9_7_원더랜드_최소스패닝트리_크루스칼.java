package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 섹션9_7_원더랜드_최소스패닝트리_크루스칼 {

    public static class Edge implements Comparable<Edge>{
        public int v1;
        public int v2;
        public int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;     //오름차순
        }
    }

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
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            unf[i] = i;
        }

        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            arr.add(new Edge(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge ob : arr){
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if(fv1!=fv2){
                answer+=ob.cost;
                Union(ob.v1, ob.v2);
            }
        }

        System.out.println(answer);

    }
}
