package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션6_2_버블정렬 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x+" ");
        }
    }

    public static int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }
}
