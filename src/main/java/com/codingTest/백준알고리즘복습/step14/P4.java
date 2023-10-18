package com.codingTest.백준알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step14
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-10-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-11        김재성       최초 생성
 */
public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] list = new String[a];
        int count = 1;
        for(int i=0; i<a; i++){
            String s = br.readLine();
            map.put(s, count);
            list[i] = s;
            count++;
        }

        for(int i=0; i<b; i++){
            String line = br.readLine(); // BufferedReader에서 문자열을 읽어옴
            if (line.matches("\\d+")) {
                //문자일경우
                int lineNo = Integer.parseInt(line);
                System.out.println(list[lineNo-1]);
            } else {
                //숫자일경우
                System.out.println(map.get(line));
            }
        }
    }
}