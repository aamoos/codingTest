package com.codingTest.알고리즘2024.chap1.sector2;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(int x: solution(n, arr)){
            System.out.print(x+" ");
        }
    }

    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}