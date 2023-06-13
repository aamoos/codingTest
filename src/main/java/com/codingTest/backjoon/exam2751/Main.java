package com.codingTest.backjoon.exam2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * packageName    : com.codingTest.backjoon.exam2750
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (Integer value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
