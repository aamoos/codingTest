package com.codingTest.초보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.초보
 * fileName       : P2386
 * author         : 김재성
 * date           : 2023-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-30        김재성       최초 생성
 */
public class P2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        while(true){
            String[] arr = br.readLine().split(" ");
            char a = arr[0].toLowerCase().toCharArray()[0];
            if('#' == a){
                break;
            }
            int count = 0;
            for(int i=1; i<arr.length; i++){
                String s = arr[i];
                for (char c : s.toCharArray()) {
                    c = Character.toLowerCase(c);
                    if(a == c){
                        count++;
                    }
                }
            }
            System.out.println(a+" "+count);
        }
    }
}