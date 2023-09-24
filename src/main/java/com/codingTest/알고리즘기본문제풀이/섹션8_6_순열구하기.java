package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션8_6_순열구하기 {

    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L){

        if(L == m){
            for(int x : pm){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
