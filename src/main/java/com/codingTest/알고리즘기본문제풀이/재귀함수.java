package com.codingTest.알고리즘기본문제풀이;

public class 재귀함수 {
    public static void main(String[] args) {
        DFS(3);
    }

    public static void DFS(int n){

        if(n==0){
            return;
        }else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
}
