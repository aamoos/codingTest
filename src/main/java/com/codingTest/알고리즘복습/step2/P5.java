package com.codingTest.알고리즘복습.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step2
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if(min < 45){
         hour--;
         min = 60-(45-min);

         if(hour < 0){
             hour = 23;
         }
            System.out.println(hour + " " + min);
        }else{
            System.out.println(hour+ " " + (min-45));
        }
    }
}
