package com.codingTest.알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : com.codingTest.알고리즘복습.step14
 * fileName       : P6
 * author         : 김재성
 * date           : 2023-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-13        김재성       최초 생성
 */
public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
