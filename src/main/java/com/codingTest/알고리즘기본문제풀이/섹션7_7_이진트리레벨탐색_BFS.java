package com.codingTest.알고리즘기본문제풀이;

import java.util.LinkedList;
import java.util.Queue;

public class 섹션7_7_이진트리레벨탐색_BFS {

    public static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }

    static Node root;
    public static void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" : ");
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }
                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root);
    }
}
