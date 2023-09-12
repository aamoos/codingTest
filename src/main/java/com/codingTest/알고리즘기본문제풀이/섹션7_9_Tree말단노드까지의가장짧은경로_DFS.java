package com.codingTest.알고리즘기본문제풀이;

public class 섹션7_9_Tree말단노드까지의가장짧은경로_DFS {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }

    static Node root;
    public static int DFS(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        }else{
            //말단노드가 아닐때
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0, root));
    }
}
