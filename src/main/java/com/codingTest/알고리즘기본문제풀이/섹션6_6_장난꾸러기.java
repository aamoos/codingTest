package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 섹션6_6_장난꾸러기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int x : solution(n, arr)){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();        //깊은복사
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }
}
