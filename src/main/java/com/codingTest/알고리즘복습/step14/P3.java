package com.codingTest.알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : com.codingTest.알고리즘복습.step14
 * fileName       : P3
 * author         : 김재성
 * date           : 2023-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-10        김재성       최초 생성
 */
public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String type = st.nextToken();

            if("enter".equals(type)){
                map.put(name, 0);
            }else{
                map.remove(name);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}
