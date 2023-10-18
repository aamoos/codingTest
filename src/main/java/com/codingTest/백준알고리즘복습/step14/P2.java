package com.codingTest.백준알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.알고리즘복습.step14
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-10        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(br.readLine(), 0);
        }
        int count = 0;

        for(int i=0; i<m; i++){
            if(map.containsKey(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}
