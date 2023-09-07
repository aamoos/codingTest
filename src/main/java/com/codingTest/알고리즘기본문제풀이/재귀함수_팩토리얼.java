package com.codingTest.알고리즘기본문제풀이;

public class 재귀함수_팩토리얼 {
    public static void main(String[] args) {
        System.out.println(DFS(5));
    }

    public static int DFS(int n){
        if(n == 1){
            return 1;
        }else{
            return n*DFS(n-1);
        }
    }
}
