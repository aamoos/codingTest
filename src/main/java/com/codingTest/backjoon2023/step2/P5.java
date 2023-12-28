package com.codingTest.backjoon2023.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon2023.step2
 * fileName       : P5
 * author         : 김재성
 * date           : 2023-12-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-28        김재성       최초 생성
 */
public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if( M < 45){
            H--;
            M = 60 - (45 - M);
            if( H < 0 ){
                H = 23;
            }
            System.out.println(H + " " + M);
        }else{
            System.out.println(H + " " + (M-45));
        }
    }
}