package com.codingTest.백준알고리즘복습.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> nSet = new HashSet<>();
        List<Integer> nList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> mSet = new HashSet<>();
        List<Integer> mList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            mSet.add(Integer.parseInt(st.nextToken()));
        }

        for (Integer i : mSet) {
            if(!nSet.contains(i)){
                nList.add(i);
            }
        }

        for (Integer i : nSet) {
            if(!mSet.contains(i)){
                mList.add(i);
            }
        }
        System.out.println(nList.size()+mList.size());
    }
}
