package com.codingTest.backjoon.exam1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon.exam1940
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-07-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-05        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        //배열선언
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        //오름차순 정렬
        Arrays.sort(A);

        int count = 0;

        //투포인터
        int i = 0;   //A[0]   (min 값)
        int j = N-1; //A[N-1] (max 값)

        while(i<j){
            if(A[i]+A[j] < M){
                i++;
            }else if(A[i]+A[j] > M){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
