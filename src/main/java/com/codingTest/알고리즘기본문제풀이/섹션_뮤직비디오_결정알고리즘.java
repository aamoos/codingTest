package com.codingTest.알고리즘기본문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 섹션_뮤직비디오_결정알고리즘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    public static int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;

        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum=x;
            }else{
                sum = sum+x;
            }
        }
        return cnt;
    }

    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();   //최대값 구하기
        int rt = Arrays.stream(arr).sum();              //합계

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }

        return answer;
    }
}