package com.codingTest.알고리즘.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘.step2
 * fileName       : P1
 * author         : 김재성
 * date           : 2023-10-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-23        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = new ArrayList<>();

        //첫번째 숫자는 무조건 포함되므로 add
        answer.add(arr[0]);

        //자신의 앞수보다 큰숫자 add
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }

        for (int x : answer) {
            System.out.print(x+ " ");
        }
    }
}