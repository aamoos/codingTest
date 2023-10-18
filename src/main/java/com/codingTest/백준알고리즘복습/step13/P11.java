package com.codingTest.백준알고리즘복습.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];  //원본 배열
        int[] sorted = new int[N];  //정렬 합 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); //rank를 매길 HashMap

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬할 배열에 대해 정렬을 수행해준다.
        Arrays.sort(sorted);

        //정렬 된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for(int v : sorted){
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
                rank++; //map에 넣고나면 다음 순위를 가리킬수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
