package com.codingTest.알고리즘기본문제풀이;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class 섹션8_1_합이같은부분집합 {

    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public static void DFS(int L, int sum, int[] arr){

        if(flag){
            return;
        }

        if(sum > total/2){
            return;
        }

        if(L == n){
            if( (total-sum) == sum ){
                answer = "YES";
                flag=true;
            }
        }
        else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
            total+=arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
