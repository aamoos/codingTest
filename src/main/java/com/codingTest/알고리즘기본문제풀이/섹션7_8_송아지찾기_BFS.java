package com.codingTest.알고리즘기본문제풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션7_8_송아지찾기_BFS {
    //최소 횟수
    static int answer = 0;
    //이동거리
    static int[] dis = {1, -1, 5};
    //한번방문한것은 queue에 안넣는다.
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();

    public static int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll(); //현재 root 노드
                if(x == e){
                    return L;
                }
                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx>=1 && nx<=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(BFS(s, e));
    }
}
