package com.codingTest.backjoon.exam1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];

        arr = br.readLine().split(" ");

        System.out.print(Prime(arr));
    }

    public static int Prime(String arr[]){
        int result = 0;

        for (String num : arr) {

            int inum = Integer.parseInt(num);

            // isPrime : 소수인지 판별
            boolean isPrime = true;

            // i : num에 나눌 값, for문을 한 바퀴 돌 때마다 1씩 증가한다.
            // 변수 i를 num/2만큼만 반복하게 해서 반복횟수를 줄인다.
            for(int i = 2; i <= inum/2; i++) {
                // 순차적으로 i를 num에 나누어본다.
                if(inum%i == 0) {
                    // num이 i로 나눠져 나머지가 0이 되면 isPrime에 false(소수가 아님)을 입력한다.
                    isPrime = false;
                    // 이미 1과 자기자신 외에 다른 수로도 나눠져 합성수임을 알았으므로 더 이상 반복하지 않고 빠져나온다.
                    break;
                }
            }

            if(inum == 1){
                isPrime = false;
            }

            // 삼항 연산자를 사용하여 isPrime이 true이면 "소수입니다."를 출력한다.
            // isPrime이 false라면 "소수가 아닙니다."를 출력한다.
            if(isPrime){
                result++;
            }
        }
        return result;
    }
}
