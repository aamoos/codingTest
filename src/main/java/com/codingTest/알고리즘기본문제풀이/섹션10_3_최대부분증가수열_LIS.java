package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션10_3_최대부분증가수열_LIS {

    public static int[] dy;

    public static int solution(int[] arr){
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;

        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i] && dy[j] > max){
                    max = dy[j];
                }
            }
            dy[i] = max+1;      //자기자신을 더하는거
            answer = Math.max(answer, dy[i]);       //dy[i] 값중에 최대값 answer에 저장
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(arr));
    }
}