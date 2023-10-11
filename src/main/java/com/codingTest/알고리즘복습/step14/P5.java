package com.codingTest.알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : com.codingTest.알고리즘복습.step14
 * fileName       : P5
 * author         : 김재성
 * date           : 2023-10-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-11        김재성       최초 생성
 */
public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //이분탐색을 위해 정렬
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int target = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, target) - lowerBound(arr, target)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high) / 2;
            if(target <= arr[mid]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high) / 2;
            if(target < arr[mid]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
