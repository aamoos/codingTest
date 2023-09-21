package com.codingTest.알고리즘기본문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 섹션6_5_중복확인 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }

        return answer;
    }
}
