package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P2501_약수구하기
 * author         : 김재성
 * date           : 2023-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        김재성       최초 생성
 */
public class P2501_약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=N; i++){
            //6이라고 할때 1,2,3,6 해당 N의 약수를 구함
            if(N % i == 0){
                list.add(i);
            }
        }

        Collections.sort(list);

        //K번째 약수가 존재 안할때
        if(list.size() <= K-1){
            System.out.print(0);
        }else{
            System.out.print(list.get(K-1));
        }
    }
}
