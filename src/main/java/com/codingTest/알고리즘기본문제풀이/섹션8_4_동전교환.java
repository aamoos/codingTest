package com.codingTest.알고리즘기본문제풀이;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 섹션8_4_동전교환 {

    static int n, m, answer = Integer.MAX_VALUE;
    public static void DFS(int L, int sum, Integer[] arr){

        if(sum > m){
            return;
        }

        if(L >= answer){
            return;
        }

        if(sum == m){
            answer = Math.min(answer, L);
        }else{
            for(int i=0; i<n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        m = scan.nextInt();

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
