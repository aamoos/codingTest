package com.codingTest.알고리즘기본문제풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섹션5_7_교육과정설계 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        System.out.println(solution(a, b));
    }

    public static String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()){
            Q.offer(x);
        }

        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x != Q.poll()){
                    return "NO";
                }
            }
        }

        if(!Q.isEmpty()){
            return "NO";
        }

        return answer;
    }
}
