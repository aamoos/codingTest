package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 섹션9_8_원더랜드_최소스패닝트리_PriorityQueue {

    public static class Edge implements Comparable<Edge>{
        public int vex;
        public int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost; //비용 오름차순으로
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));   //무방향이라 추가해줘야함
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer+=tmp.cost;
                for(Edge ob : graph.get(ev)){
                    if(ch[ob.vex] == 0){
                        pQ.offer(new Edge(ob.vex, ob.cost));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
