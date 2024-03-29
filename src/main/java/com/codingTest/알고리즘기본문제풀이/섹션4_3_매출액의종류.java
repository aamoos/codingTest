package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 섹션4_3_매출액의종류 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int x : solution(n, k, arr)){
            System.out.print(x+" ");
        }

    }

    public static ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) +1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);

            if(HM.get(arr[lt]) == 0){
                HM.remove(arr[lt]);
            }
            lt++;

        }
        return answer;
    }
}
