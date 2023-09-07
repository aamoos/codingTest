package com.codingTest.알고리즘기본문제풀이;

public class 재귀함수_이진수 {
    public static void main(String[] args) {
        DFS(11);
    }

    public static void DFS(int n){
        if(n == 0){
            return;
        }else{
            DFS(n/2);
            System.out.println(n%2+" ");
        }
    }

}
