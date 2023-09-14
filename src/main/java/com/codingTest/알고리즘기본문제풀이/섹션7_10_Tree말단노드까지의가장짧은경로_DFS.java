package com.codingTest.알고리즘기본문제풀이;

import java.util.LinkedList;
import java.util.Queue;

public class 섹션7_10_Tree말단노드까지의가장짧은경로_DFS {

    public static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }

    static Node root;
    public static int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null){
                    return L;
                }
                //자식이 있음
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }

                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        //return 까지는 오지않음
        return 0;
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
