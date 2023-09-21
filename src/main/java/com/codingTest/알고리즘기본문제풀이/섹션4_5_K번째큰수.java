package com.codingTest.알고리즘기본문제풀이;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class 섹션4_5_K번째큰수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }

    public static int solution(int[] arr, int n, int k){
        int answer = -1;

        //내림차순
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);     //중복값을 제외하고 내림차순
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==k){
                return x;
            }
        }
        return answer;
    }
}
