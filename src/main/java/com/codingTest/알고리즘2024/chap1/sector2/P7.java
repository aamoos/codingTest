package com.codingTest.알고리즘2024.chap1.sector2;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        int answer = 0, cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }

        return answer;
    }

}
