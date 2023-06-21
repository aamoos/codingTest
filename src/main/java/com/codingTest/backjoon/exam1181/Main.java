package com.codingTest.backjoon.exam1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : com.codingTest.backjoon.exam1181
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }

                else{
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append('\n');

        for(int i=1; i<N; i++){
            //중복되지 않는 단어만 출력
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
