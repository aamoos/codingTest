package com.codingTest.알고리즘기본문제풀이;

public class 재귀함수_피보나치수열 {
    static int[] fibo;
    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        DFS(n);
        for(int i=1; i<=n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }

    public static int DFS(int n){
        //메모이제이션
        if(fibo[n] > 0){
            return fibo[n];
        }

        if(n == 1){
            return  fibo[n] = 1;
        }else if(n == 2){
            return  fibo[n] = 1;
        }else{
            return fibo[n] = DFS(n-2)+DFS(n-1);
        }
    }
}
