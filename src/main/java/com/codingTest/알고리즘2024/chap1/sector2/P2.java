package com.codingTest.알고리즘2024.chap1.sector2;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        int answer = 1, max = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }
}
