package com.codingTest.알고리즘.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘.step2
 * fileName       : P6
 * author         : 김재성
 * date           : 2023-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-25        김재성       최초 생성
 */
public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }

            //소수인지 확인
            if(isPrime(res)){
                answer.add(res);
            }
        }

        for (int x : answer) {
            System.out.print(x+" ");
        }
    }

    public static boolean isPrime(int num){
        //1은 소수가 아님
        if(num == 1){
            return false;
        }

        for(int i=2; i<num; i++){
            if(num%i == 0){
                //약수가 존재
                return false;
            }
        }
        return true;
    }
}