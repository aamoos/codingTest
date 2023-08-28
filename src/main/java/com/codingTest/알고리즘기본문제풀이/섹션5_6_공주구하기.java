package com.codingTest.알고리즘기본문제풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션5_6_공주구하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            Q.offer(i);
        }

        while(!Q.isEmpty()){
            for(int i=1; i<k; i++){
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size() == 1){
                answer = Q.poll();
            }
        }

        return answer;
    }
}
