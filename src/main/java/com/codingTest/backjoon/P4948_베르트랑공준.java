package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P4948_베르트랑공준
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P4948_베르트랑공준 {

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();    //소수를 얻는 메소드 실행

        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());

            //n이 0일경우 for문 종료
            if(n==0){
                break;
            }

            int count = 0;  //소수 개수를 셀 변수

            for(int i=n+1; i<=2*n; i++){
                if(!prime[i]){
                    count++;
                }
            }
            sb.append(count).append('\n');  //문자열로 이어준다.
        }
        System.out.println(sb);
    }

    //소수를 얻는 메소드
    public static void get_prime(){

        //0과 1은 소수가 아니므로 true
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }

            for(int j=i*i; j<prime.length; j=j+i){
                prime[j] = true;
            }
        }
    }
}
