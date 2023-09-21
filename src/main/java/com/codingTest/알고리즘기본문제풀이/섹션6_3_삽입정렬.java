package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션6_3_삽입정렬 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int x : solution(n, arr)){
            System.out.print(x+ " ");
        }
    }

    public static int[] solution(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp = arr[i];
            int j = 0;
            for(j = i - 1; j>=0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
}
