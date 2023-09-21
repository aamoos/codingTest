package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션7_14_그래프최단거리_BFS {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : " + dis[i]);
        }
    }
}
