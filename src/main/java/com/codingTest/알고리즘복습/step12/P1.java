package com.codingTest.알고리즘복습.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step12
 * fileName       : P1
 * author         : 김재성
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        김재성       최초 생성
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = 0;

        for(int i=0; i<a; i++){
            for(int j=i+1; j<a; j++){
                for(int k=j+1; k<a; k++){
                    //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    int sum = arr[i]+arr[j]+arr[k];

                    if(sum > b){
                        break;
                    }

                    if(sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
