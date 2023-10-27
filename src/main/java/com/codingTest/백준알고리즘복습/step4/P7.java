package com.codingTest.백준알고리즘복습.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.codingTest.백준알고리즘복습.step4
 * fileName       : P7
 * author         : 김재성
 * date           : 2023-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-27        김재성       최초 생성
 */
public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<28; i++){
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }

        for(int i=1; i<=30; i++){
            if(!list.contains(i)){
                System.out.println(i);
            }
        }
    }
}