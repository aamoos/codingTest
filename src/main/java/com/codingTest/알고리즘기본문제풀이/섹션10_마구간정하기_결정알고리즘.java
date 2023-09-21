package com.codingTest.알고리즘기본문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 섹션10_마구간정하기_결정알고리즘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, c, arr));
    }

    public static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static int solution(int n, int c, int[] arr){
        int answer = 0;

        //좌표 정렬
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];

        //이분검색 이거 외우셈!
        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) >=c ){
                answer=mid;
                lt=mid+1;
            }else{
                rt=mid-1;
            }
        }
        return answer;
    }
}
