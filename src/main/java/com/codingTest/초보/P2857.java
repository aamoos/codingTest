package com.codingTest.초보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.초보
 * fileName       : P2857
 * author         : 김재성
 * date           : 2023-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-30        김재성       최초 생성
 */
public class P2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<5; i++){
            String s = br.readLine();
            if(s.contains("FBI")){
                sb.append(i+1+" ");
                count++;
            }
        }

        if(count == 0){
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb.toString());
    }
}