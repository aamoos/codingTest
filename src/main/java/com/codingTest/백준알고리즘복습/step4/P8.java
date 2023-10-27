package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step4
 * fileName       : P8
 * author         : 김재성
 * date           : 2023-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-27        김재성       최초 생성
 */
public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++){
            int a = Integer.parseInt(br.readLine());
            set.add(a%42);
        }

        System.out.println(set.size());

    }
}