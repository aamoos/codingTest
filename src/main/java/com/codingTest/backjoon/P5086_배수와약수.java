package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P5086_배수와약수
 * author         : 김재성
 * date           : 2023-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        김재성       최초 생성
 */
public class P5086_배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //두수가 같은경우는 없다.
            if(a!=b){
                //b가 a의 약수일때
                if(b%a == 0){
                    System.out.println("factor");
                }else if(a%b == 0){
                    //ㅁ가 b의 배수일때
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }

            //a==0 b==0일때 빠져나옴
            if(a==0 && b==0){
                break;
            }
        }

    }
}
