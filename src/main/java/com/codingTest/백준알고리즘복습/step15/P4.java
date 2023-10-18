package com.codingTest.백준알고리즘복습.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName    : com.codingTest.알고리즘복습.step15
 * fileName       : P4
 * author         : 김재성
 * date           : 2023-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-17        김재성       최초 생성
 */
public class P4 {
    static int[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        tree = new int[N];

        for(int i=0; i<N; i++){
            tree[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tree);
        int gcd = 0;
        for(int i=0; i<N-1; i++){
            int distance = tree[i+1]-tree[i];
            gcd = GCD(distance, gcd);
        }
        System.out.println((tree[N-1]-tree[0])/gcd+1-(tree.length));

    }

    //유클리드 호제법
    static int GCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return GCD(b, a%b);
        }
    }
}